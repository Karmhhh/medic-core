package it.medicCore.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.*;
/*
 * 
12. Tabella Prescrizioni_Mediche
sql
Copia codice
CREATE TABLE Prescrizioni_Mediche (
    id_prescrizione INT PRIMARY KEY AUTO_INCREMENT,
    data_prescrizione DATE NOT NULL,
    id_trattamento INT,
    id_farmaco INT,
    dosaggio VARCHAR(50),
    FOREIGN KEY (id_trattamento) REFERENCES Trattamenti(id_trattamento),
    FOREIGN KEY (id_farmaco) REFERENCES Farmaci(id_farmaco)
);


 */
@Entity
public class PrescrizioniMediche {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id_prescrizioni_mediche;
    
    @Column(name = "data_prescrizione")
    private LocalDate data_prescrizione;

    @Column(name = "dosaggio")
    private String dosaggio;

    @ManyToOne
    @JoinColumn(name="trattamento_associato")
    private Trattamenti trattamento;

    @ManyToOne
    @JoinColumn(name="farmaco")
    private Farmaco farmaco;

    public int getId_prescrizioni_mediche() {
        return id_prescrizioni_mediche;
    }

    public void setId_prescrizioni_mediche(int id_prescrizioni_mediche) {
        this.id_prescrizioni_mediche = id_prescrizioni_mediche;
    }

    public LocalDate getData_prescrizione() {
        return data_prescrizione;
    }

    public void setData_prescrizione(LocalDate data_prescrizione) {
        this.data_prescrizione = data_prescrizione;
    }

    public String getDosaggio() {
        return dosaggio;
    }

    public void setDosaggio(String dosaggio) {
        this.dosaggio = dosaggio;
    }

    public Trattamenti getTrattamento() {
        return trattamento;
    }

    public void setTrattamento(Trattamenti trattamento) {
        this.trattamento = trattamento;
    }

    public Farmaco getFarmaco() {
        return farmaco;
    }

    public void setFarmaco(Farmaco farmaco) {
        this.farmaco = farmaco;
    }

}
