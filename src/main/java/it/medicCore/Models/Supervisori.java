package it.medicCore.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
/*
CREATE TABLE Supervisori (
    id_supervisore INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    cognome VARCHAR(100) NOT NULL,
    id_ospedale INT,
    FOREIGN KEY (id_ospedale) REFERENCES Ospedali(id_ospedale)
);
 */
import jakarta.persistence.ManyToOne;
@Entity
public class Supervisori {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id_supervisore;
    @Column(name = "nome")
    private String nome;
    @Column(name = "cognome")
    private String cognome;
    @ManyToOne
    @JoinColumn(name = "ospesale_assegnato")
    private Ospedali ospedale_assegnato;
    public int getId_supervisore() {
        return id_supervisore;
    }
    public void setId_supervisore(int id_supervisore) {
        this.id_supervisore = id_supervisore;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public Ospedali getOspedale_assegnato() {
        return ospedale_assegnato;
    }
    public void setOspedale_assegnato(Ospedali ospedale_assegnato) {
        this.ospedale_assegnato = ospedale_assegnato;
    }



}
