package it.medicCore.Models;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "regioni")

public class Regioni {

    @Id
    @Column(name = "codice_istat")
    private Integer codiceIstat;

    @Column(name = "regione_nome")
    private String nomeRegione;

    @Column(name = "capoluogo")
    private String capoluogo;

    @OneToMany(mappedBy = "codiceIstatRegione")
    private List<Comuni> comuni;

    public Integer getCodiceIstat() {
        return codiceIstat;
    }

    public void setCodiceIstat(Integer codiceIstat) {
        this.codiceIstat = codiceIstat;
    }

    public String getNomeRegione() {
        return nomeRegione;
    }

    public void setNomeRegione(String nomeRegione) {
        this.nomeRegione = nomeRegione;
    }

    public String getCapoluogo() {
        return capoluogo;
    }

    public void setCapoluogo(String capoluogo) {
        this.capoluogo = capoluogo;
    }

    public List<Comuni> getComuni() {
        return comuni;
    }

    public void setComuni(List<Comuni> comuni) {
        this.comuni = comuni;
    }

}
