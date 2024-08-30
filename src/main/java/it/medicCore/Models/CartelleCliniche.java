package it.medicCore.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.*;

/*
CREATE TABLE Cartelle_Cliniche (
    id_cartella INT PRIMARY KEY AUTO_INCREMENT,
    id_paziente INT,
    data_apertura DATE,
    diagnosi TEXT,
    id_trattamento INT,
    FOREIGN KEY (id_paziente) REFERENCES Pazienti(id_paziente),
    FOREIGN KEY (id_trattamento) REFERENCES Trattamenti(id_trattamento)
);

 */
@Entity
public class CartelleCliniche {

    @Id
    @Column(name = "id")
    private Integer id_cartella;

    @Column(name = "data_apertura")
    private LocalDate data_apertura;

    @Column(name = "diagnosi")
    private String diagnosi;

    @ManyToOne
    @JoinColumn(name = "id_trattamento")
    private Trattamenti trattamento;

    @ManyToOne
    @JoinColumn(name = "id_paziente")
    private Pazienti paziente;

    public Integer getId_cartella() {
        return id_cartella;
    }

    public void setId_cartella(Integer id_cartella) {
        this.id_cartella = id_cartella;
    }

    public LocalDate getData_apertura() {
        return data_apertura;
    }

    public void setData_apertura(LocalDate data_apertura) {
        this.data_apertura = data_apertura;
    }

    public String getDiagnosi() {
        return diagnosi;
    }

    public void setDiagnosi(String diagnosi) {
        this.diagnosi = diagnosi;
    }

    public Trattamenti getTrattamento() {
        return trattamento;
    }

    public void setTrattamento(Trattamenti trattamento) {
        this.trattamento = trattamento;
    }

    public Pazienti getPaziente() {
        return paziente;
    }

    public void setPaziente(Pazienti paziente) {
        this.paziente = paziente;
    }

}
