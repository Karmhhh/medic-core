package it.medicCore.Models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "comuni")
public class Comuni {
    @Id
    @Column(name = "procom")
    private Integer procom;

    @ManyToOne
    @JoinColumn(name = "codice_istat")
    private Regioni codiceIstatRegione;

    @OneToMany(mappedBy = "comune")
    private List<Ospedali> ospedali;

    @OneToMany(mappedBy = "comune")
    private List<Pazienti> pazienti;

    @Column(name = "comune_nome")
    private String nomeComune;

    @Column(name = "provincia_nome")
    private String provincia;

    public Integer getProcom() {
        return procom;
    }

    public void setProcom(Integer procom) {
        this.procom = procom;
    }

    public Regioni getCodiceIstatRegione() {
        return codiceIstatRegione;
    }

    public void setCodiceIstatRegione(Regioni codiceIstatRegione) {
        this.codiceIstatRegione = codiceIstatRegione;
    }

    public String getNomeComune() {
        return nomeComune;
    }

    public void setNomeComune(String nomeComune) {
        this.nomeComune = nomeComune;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public List<Ospedali> getOspedali() {
        return ospedali;
    }

    public void setOspedali(List<Ospedali> ospedali) {
        this.ospedali = ospedali;
    }

    public List<Pazienti> getPazienti() {
        return pazienti;
    }

    public void setPazienti(List<Pazienti> pazienti) {
        this.pazienti = pazienti;
    }
}
