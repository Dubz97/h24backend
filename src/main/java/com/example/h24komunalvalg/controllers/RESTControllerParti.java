package com.example.h24komunalvalg.controllers;


import com.example.h24komunalvalg.model.Parti;
import com.example.h24komunalvalg.repository.PartiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class RESTControllerParti {

  @Autowired
  PartiRepository partiRepository;

  @GetMapping("/partier")
  public List<Parti> getAllPartier() {
    return partiRepository.findAll();
  }

  @PostMapping("/create/parti")
  @ResponseStatus(HttpStatus.CREATED)
  public Parti postParti(@RequestBody Parti parti) {
    return partiRepository.save(parti);
  }


  @PutMapping("/update/parti/{id}")
  public ResponseEntity<Parti> updateParti(
      @PathVariable int id, @RequestBody Parti parti) {
    parti.setPartiId(id);
    Optional<Parti> optionalActivity = partiRepository.findById(id);
    if (optionalActivity.isPresent()) {
      partiRepository.save(parti);
      return new ResponseEntity<>(parti, HttpStatus.OK);
    } else {
      Parti notFound = new Parti();
      notFound.setPartiNavn("Not found by id: " + id);
      return new ResponseEntity<>(notFound, HttpStatus.NOT_FOUND);
    }
  }

  @DeleteMapping("/delete/parti/{id}")
  public ResponseEntity<String> deleteParti(@PathVariable int id) {
    try {
      partiRepository.deleteById(id);
      return new ResponseEntity<>("delete id = " + id, HttpStatus.OK);
    } catch (Exception err) {
      return new ResponseEntity<>("Could not find id = " + id, HttpStatus.NOT_FOUND);
    }
  }
  

}
