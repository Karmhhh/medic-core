package it.medicCore.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import java.util.*;
/* 
CREATE TABLE Medici (
    id_medico INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    cognome VARCHAR(100) NOT NULL,
    id_reparto INT,
    id_specializzazione INT,
    FOREIGN KEY (id_reparto) REFERENCES Reparti(id_reparto),
    FOREIGN KEY (id_specializzazione) REFERENCES Specializzazioni(id_specializzazione)
);
*/
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Medici {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_medico;

    @OneToMany(mappedBy = "medico_di_base")
    private List<Pazienti> pazienti;

    @Column(name = "nome")
    private String nome;
    
    @Column(name = "cognome")
    private String cognome;

    @ManyToOne
    @JoinColumn(name = "id_reparto")
    private Reparto reparto;

    @ManyToOne
    @JoinColumn(name = "id_specializzazione")
    private Specializzazione specializzazione;

    public int getId_medico() {
        return id_medico;
    }

    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
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

    public Reparto getReparto() {
        return reparto;
    }

    public void setReparto(Reparto reparto) {
        this.reparto = reparto;
    }

    public Specializzazione getSpecializzazione() {
        return specializzazione;
    }

    public void setSpecializzazione(Specializzazione specializzazione) {
        this.specializzazione = specializzazione;
    }

}
