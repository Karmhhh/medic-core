package it.medicCore.Models;
import java.util.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Ospedali {
    @Id
    @Column(name = "id_ospedale")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "ospedale_nome")
    private String ospedaleNome;

    @Column(name = "indirizzo")
    private String indirizzo;

    @ManyToOne
    @JoinColumn(name = "comune_appartenenza") 
    private Comuni comune;
    
    @OneToMany(mappedBy = "id_reparto")
    private List<Reparto> reparto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOspedaleNome() {
        return ospedaleNome;
    }

    public void setOspedaleNome(String ospedaleNome) {
        this.ospedaleNome = ospedaleNome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public Comuni getComune() {
        return comune;
    }

    public void setComune(Comuni comune) {
        this.comune = comune;
    }

    public List<Reparto> getReparto() {
        return reparto;
    }

    public void setReparto(List<Reparto> reparto) {
        this.reparto = reparto;
    }
    
}

