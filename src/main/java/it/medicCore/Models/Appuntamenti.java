package it.medicCore.Models;

import java.time.*;
import java.util.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

/*
 * codice
CREATE TABLE Appuntamenti (
    id_appuntamento INT PRIMARY KEY AUTO_INCREMENT,
    data DATE NOT NULL,
    ora TIME NOT NULL,
    id_paziente INT,
    id_medico INT,
    id_stanza INT,
    FOREIGN KEY (id_paziente) REFERENCES Pazienti(id_paziente),
    FOREIGN KEY (id_medico) REFERENCES Medici(id_medico),
    FOREIGN KEY (id_stanza) REFERENCES Stanze_Ospedaliere(id_stanza)
);

 */
@Entity
public class Appuntamenti {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_appuntamenti")
    private int id;

    @Column(name = "data_appuntamento")
    private LocalDate data_appuntamento;

    @Column(name = "ora_appuntamento")
    private LocalTime specificTime;

    @OneToMany(mappedBy = "id_paziente")
    private List<Pazienti> pazienti;

    @OneToMany(mappedBy = "id_medico")
    private List<Medici> medici;
    
    @OneToMany(mappedBy = "id_stanza")
    private List<StanzeOspedaliere> Stanze_Ospedaliere;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData_appuntamento() {
        return data_appuntamento;
    }

    public void setData_appuntamento(LocalDate data_appuntamento) {
        this.data_appuntamento = data_appuntamento;
    }

    public LocalTime getSpecificTime() {
        return specificTime;
    }

    public void setSpecificTime(LocalTime specificTime) {
        this.specificTime = specificTime;
    }

    public List<Pazienti> getPazienti() {
        return pazienti;
    }

    public void setPazienti(List<Pazienti> pazienti) {
        this.pazienti = pazienti;
    }

    public List<Medici> getMedici() {
        return medici;
    }

    public void setMedici(List<Medici> medici) {
        this.medici = medici;
    }

    public List<StanzeOspedaliere> getStanze_Ospedaliere() {
        return Stanze_Ospedaliere;
    }

    public void setStanze_Ospedaliere(List<StanzeOspedaliere> stanze_Ospedaliere) {
        Stanze_Ospedaliere = stanze_Ospedaliere;
    }
}
