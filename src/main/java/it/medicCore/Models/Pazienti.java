package it.medicCore.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/*
 * CREATE TABLE Pazienti (
    id_paziente INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    cognome VARCHAR(100) NOT NULL,
    codice_fiscale VARCHAR(16) UNIQUE NOT NULL,
    procom INT,
    id_medico_base INT,
    FOREIGN KEY (procom) REFERENCES Comuni(procom),
    FOREIGN KEY (id_medico_base) REFERENCES Medici(id_medico)
);

 */
@Entity
public class Pazienti {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id_paziente;

    @Column(name = "nome")
    private String nome;
    
    @Column(name = "cognome")
    private String cognome;

    @Column(name = "codice_fiscale" , unique = true)
    private String cf;

    @ManyToOne
    @JoinColumn(name = "comune_residenza")
    private Comuni comune;
    @ManyToOne
    @JoinColumn(name = "medico_di_base")
    private Medici medico_di_base;
}
