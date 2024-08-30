package it.medicCore.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

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
import java.util.*;
@Entity
public class Pazienti {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id_paziente;

    @Column(name = "nome")
    private String nome;
    
    @OneToOne(mappedBy = "id_cartella")
    private List<CartelleCliniche> cartelleCliniche;
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
    public int getId_paziente() {
        return id_paziente;
    }
    public void setId_paziente(int id_paziente) {
        this.id_paziente = id_paziente;
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
    public String getCf() {
        return cf;
    }
    public void setCf(String cf) {
        this.cf = cf;
    }
    public Comuni getComune() {
        return comune;
    }
    public void setComune(Comuni comune) {
        this.comune = comune;
    }
    public Medici getMedico_di_base() {
        return medico_di_base;
    }
    public void setMedico_di_base(Medici medico_di_base) {
        this.medico_di_base = medico_di_base;
    }
    public List<CartelleCliniche> getCartelleCliniche() {
        return cartelleCliniche;
    }
    public void setCartelleCliniche(List<CartelleCliniche> cartelleCliniche) {
        this.cartelleCliniche = cartelleCliniche;
    }
}
