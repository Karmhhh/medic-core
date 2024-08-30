package it.medicCore.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/*
CREATE TABLE Stanze_Ospedaliere (
    id_stanza INT PRIMARY KEY AUTO_INCREMENT,
    numero_stanza VARCHAR(10) NOT NULL,
    id_reparto INT,
    numero_letti INT,
    FOREIGN KEY (id_reparto) REFERENCES Reparti(id_reparto)
);

 */
@Entity
public class StanzeOspedaliere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id_stanza;
    
    @Column(name = "numero_stanza")
    private int numero_stanza;

    @Column(name="numero_letti")
    private int numero_letti;

    @ManyToOne
    @JoinColumn(name = "id_reparto")
    private Reparto reparto;

    public int getId_stanza() {
        return id_stanza;
    }

    public void setId_stanza(int id_stanza) {
        this.id_stanza = id_stanza;
    }

    public int getNumero_stanza() {
        return numero_stanza;
    }

    public void setNumero_stanza(int numero_stanza) {
        this.numero_stanza = numero_stanza;
    }

    public int getNumero_letti() {
        return numero_letti;
    }

    public void setNumero_letti(int numero_letti) {
        this.numero_letti = numero_letti;
    }

    public Reparto getReparto() {
        return reparto;
    }

    public void setReparto(Reparto reparto) {
        this.reparto = reparto;
    }
}
