package it.medicCore.Models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

/*CREATE TABLE Reparti (
    id_reparto INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    id_ospedale INT,
    FOREIGN KEY (id_ospedale) REFERENCES Ospedali(id_ospedale)
);

 */
@Entity
public class Reparto {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column(name="id")
    private int id_reparto;

    @Column(name="nome")
    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_ospedale")
    private Ospedali ospedale;

    @OneToMany(mappedBy = "id_stanza")
    private List<StanzeOspedaliere> stanzeOspedaliere;
    
    @OneToMany(mappedBy = "id_medico")
    private List<Medici> medici;

    public int getId_reparto() {
        return id_reparto;
    }

    public void setId_reparto(int id_reparto) {
        this.id_reparto = id_reparto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Ospedali getOspedale() {
        return ospedale;
    }

    public void setOspedale(Ospedali ospedale) {
        this.ospedale = ospedale;
    }

    public List<StanzeOspedaliere> getStanzeOspedaliere() {
        return stanzeOspedaliere;
    }

    public void setStanzeOspedaliere(List<StanzeOspedaliere> stanzeOspedaliere) {
        this.stanzeOspedaliere = stanzeOspedaliere;
    }

    public List<Medici> getMedici() {
        return medici;
    }

    public void setMedici(List<Medici> medici) {
        this.medici = medici;
    }
    

}
