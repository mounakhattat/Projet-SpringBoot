package com.example.station_ski.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name = "Moniteur")
public class Moniteur implements Serializable {  // convertir la forme l'objet en  byte pour la protection du data //
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idMoniteur")
    private Integer idMoniteur; // Clé primaire
    private Long numMoniteur;
    private String nomM;
    private String prenomM;
    private Date daterecru;


// Constructeur et accesseurs (getters) et mutateurs (setters)
}
