package com.example.h24komunalvalg.model;

import javax.persistence.*;

@Entity
public class Kandidat {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int kandidatId;

  @Column(nullable = false)
  private String kandidatNavn;

  @Column(nullable = false)
  private int kandidatStemmetal;

  @ManyToOne
  @JoinColumn(name = "partiId")
  private Parti parti;





  public int getKandidatId() {
    return kandidatId;
  }

  public void setKandidatId(int kandidatId) {
    this.kandidatId = kandidatId;
  }

  public String getKandidatNavn() {
    return kandidatNavn;
  }

  public void setKandidatNavn(String kandidatNavn) {
    this.kandidatNavn = kandidatNavn;
  }

  public int getKandidatStemmetal() {
    return kandidatStemmetal;
  }

  public void setKandidatStemmetal(int kandidatStemmetal) {
    this.kandidatStemmetal = kandidatStemmetal;
  }

  public Parti getParti() {
    return parti;
  }

  public void setParti(Parti parti) {
    this.parti = parti;
  }
}
