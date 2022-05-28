package com.example.h24komunalvalg.controllers;

import com.example.h24komunalvalg.model.Kandidat;
import com.example.h24komunalvalg.repository.KandidatRepository;
import com.example.h24komunalvalg.repository.PartiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class RESTControllerKandidat {

  @Autowired
  PartiRepository partiRepository;

  @Autowired
  KandidatRepository kandidatRepository;

  @GetMapping("/kandidater")
  public List<Kandidat> getAllKandidater() {
    return kandidatRepository.findAll();
  }

  @PostMapping("/create/kandidat")
  @ResponseStatus(HttpStatus.CREATED)
  public Kandidat postActivity(@RequestBody Kandidat kandidat) {
    return kandidatRepository.save(kandidat);
  }


  @PutMapping("/update/kandidat/{id}")
  public ResponseEntity<Kandidat> updateKandidat(
      @PathVariable int id, @RequestBody Kandidat kandidat) {
    kandidat.setKandidatId(id);
    Optional<Kandidat> optionalKandidat = kandidatRepository.findById(id);
    if (optionalKandidat.isPresent()) {
      kandidatRepository.save(kandidat);
      return new ResponseEntity<>(kandidat, HttpStatus.OK);
    } else {
      Kandidat notFound = new Kandidat();
      notFound.setKandidatNavn("Not found by id: " + id);
      return new ResponseEntity<>(notFound, HttpStatus.NOT_FOUND);
    }
  }

  @DeleteMapping("/delete/kandidat/{id}")
  public ResponseEntity<String> deleteKandidat(@PathVariable int id) {
    try {
      kandidatRepository.deleteById(id);
      return new ResponseEntity<>("delete id = " + id, HttpStatus.OK);
    } catch (Exception err) {
      return new ResponseEntity<>("Could not id at all = " + id, HttpStatus.NOT_FOUND);
    }
  }


  @GetMapping("/kandidat/parti/{partiId}")
  public List<Kandidat> getKandidatFraParti(@PathVariable int partiId) {
    List<Kandidat> obj = kandidatRepository.findAll();
    List<Kandidat> result = new ArrayList<>();
    if (!obj.isEmpty()) {
      for (Kandidat k : obj) {
        if (k.getParti().getPartiId() == partiId) {
          result.add(k);
        }

      }
    }
    return result;
  }


}
