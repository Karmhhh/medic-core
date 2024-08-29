package it.medicCore.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Ospedali {
    @Id
    @Column(name = "id_ospedale")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "ospedale_nome")
    private String ospedaleNome;
    @Column(name = "indirizzo")
    private String indirizzo;
    @ManyToOne
    @JoinColumn(name = "comune_appartenenza") 
    private Comuni comune;
}
