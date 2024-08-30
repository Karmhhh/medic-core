package it.medicCore.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.*;
import java.time.*;

/*
 * CREATE TABLE Trattamenti (
    id_trattamento INT PRIMARY KEY AUTO_INCREMENT,
    descrizione TEXT,
    data_inizio DATE,
    data_fine DATE,
    id_appuntamento INT,
    FOREIGN KEY (id_appuntamento) REFERENCES Appuntamenti(id_appuntamento)
);

 */
@Entity
public class Trattamenti {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id_trattamento;
    @Column(name = "descrizione")
    private String descrizione;
    @Column(name = "data_inizio")
    private LocalDate data_inizio;
    @Column(name = "data_fine")
    private LocalDate data_fine;
    @ManyToOne
    @JoinColumn(name = "appuntamento")
    private Appuntamenti appuntamento;

    @OneToOne(mappedBy = "id_cartella")
    private List<CartelleCliniche> cartelleCliniche;
    @OneToMany(mappedBy = "id_prescrizioni_mediche")
    private List<PrescrizioniMediche> prescrizioni_medica;

    public int getId_trattamento() {
        return id_trattamento;
    }

    public void setId_trattamento(int id_trattamento) {
        this.id_trattamento = id_trattamento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public LocalDate getData_inizio() {
        return data_inizio;
    }

    public void setData_inizio(LocalDate data_inizio) {
        this.data_inizio = data_inizio;
    }

    public LocalDate getData_fine() {
        return data_fine;
    }

    public void setData_fine(LocalDate data_fine) {
        this.data_fine = data_fine;
    }

    public Appuntamenti getAppuntamento() {
        return appuntamento;
    }

    public void setAppuntamento(Appuntamenti appuntamento) {
        this.appuntamento = appuntamento;
    }

    public List<PrescrizioniMediche> getPrescrizioni_medica() {
        return prescrizioni_medica;
    }

    public void setPrescrizioni_medica(List<PrescrizioniMediche> prescrizioni_medica) {
        this.prescrizioni_medica = prescrizioni_medica;
    }

    public List<CartelleCliniche> getCartelleCliniche() {
        return cartelleCliniche;
    }

    public void setCartelleCliniche(List<CartelleCliniche> cartelleCliniche) {
        this.cartelleCliniche = cartelleCliniche;
    }
}
