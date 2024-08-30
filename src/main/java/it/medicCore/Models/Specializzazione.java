package it.medicCore.Models;


import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

/*
 * CREATE TABLE Specializzazioni (
    id_specializzazione INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL
);

 */
@Entity
public class Specializzazione {
    
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id_specializzazione;

    @Column( name="nome")
    private String nome;
    
    @OneToMany(mappedBy = "id_medico")
    private List<Medici> medici;

    public int getId_specializzazione() {
        return id_specializzazione;
    }

    public void setId_specializzazione(int id_specializzazione) {
        this.id_specializzazione = id_specializzazione;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Medici> getMedici() {
        return medici;
    }

    public void setMedici(List<Medici> medici) {
        this.medici = medici;
    }
}
