package com.example.h24komunalvalg.model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Parti {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int partiId;
  @Column(nullable = false)
  private String partiBogstav;

  @Column(nullable = false)
  private String partiNavn;

  private int partiStemmetal;

  private double procentDel;

  @OneToMany
  @JoinColumn(name = "partiId")
  @JsonBackReference
  private Set<Kandidat> kandidater = new HashSet<>();


  public int getPartiId() {
    return partiId;
  }

  public void setPartiId(int partiId) {
    this.partiId = partiId;
  }

  public String getPartiBogstav() {
    return partiBogstav;
  }

  public void setPartiBogstav(String partiBogstav) {
    this.partiBogstav = partiBogstav;
  }

  public String getPartiNavn() {
    return partiNavn;
  }

  public void setPartiNavn(String partiNavn) {
    this.partiNavn = partiNavn;
  }

  public int getPartiStemmetal() {
    return partiStemmetal;
  }

  public void setPartiStemmetal(int partiStemmetal) {
    this.partiStemmetal = partiStemmetal;
  }

  public Set<Kandidat> getKandidater() {
    return kandidater;
  }

  public void setKandidater(Set<Kandidat> kandidater) {
    this.kandidater = kandidater;
  }

  public double getProcentDel() {
    return procentDel;
  }

  public void setProcentDel(double procentDel) {
    this.procentDel = procentDel;
  }
}
