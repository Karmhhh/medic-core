package it.medicCore.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.*;
/*CREATE TABLE Farmaci (
    id_farmaco INT PRIMARY KEY AUTO_INCREMENT,
    farmaco_nome VARCHAR(100) NOT NULL,
    confezione TEXT
ditta TEXT
prezzo_pubblico double
);
 */
import jakarta.persistence.OneToMany;

@Entity
public class Farmaco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id_farmaco;

    @Column(name = "nome")
    private String nome;

    @Column(name = "confezione")
    private String confezione;

    @Column(name = "ditta")
    private String ditta;

    @Column(name = "prezzo_pubblico")
    private double prezzo_pubblico;

    @OneToMany(mappedBy = "id_prescrizione_medica")
    private List<PrescrizioniMediche> prescrizioni;

    public int getId_farmaco() {
        return id_farmaco;
    }

    public void setId_farmaco(int id_farmaco) {
        this.id_farmaco = id_farmaco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConfezione() {
        return confezione;
    }

    public void setConfezione(String confezione) {
        this.confezione = confezione;
    }

    public String getDitta() {
        return ditta;
    }

    public void setDitta(String ditta) {
        this.ditta = ditta;
    }

    public double getPrezzo_pubblico() {
        return prezzo_pubblico;
    }

    public void setPrezzo_pubblico(double prezzo_pubblico) {
        this.prezzo_pubblico = prezzo_pubblico;
    }

    public List<PrescrizioniMediche> getPrescrizioni() {
        return prescrizioni;
    }

    public void setPrescrizioni(List<PrescrizioniMediche> prescrizioni) {
        this.prescrizioni = prescrizioni;
    }

}
