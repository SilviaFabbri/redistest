package it.sinapsi.redistest.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity(name = "vendita")
public class VenditaPostgres implements Serializable {
    @jakarta.persistence.Id
    private UUID Id;
    @Column(nullable = false)
    private String ragioneSociale;
  ////private Long pIva;
    @Column(nullable = false)
    private String indirizzo;
    @Column(nullable = false)
    private LocalDate venditaData = LocalDate.now();
    @Column(nullable = false)
    private LocalDate venditaScadenza = LocalDate.now().plusMonths(3);

    public UUID getId() {
        return Id;
    }

    public void setId(UUID venditaId) {
        this.Id = venditaId;
    }

    public String getRagioneSociale() {
        return ragioneSociale;
    }

    public void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }

    //public Long getpIva() {
      //  return pIva;
    //}

    //public void setpIva(Long pIva) {
      //  this.pIva = pIva;
    //}

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public LocalDate getVenditaData() {
        return venditaData;
    }

    public void setVenditaData(LocalDate venditaData) {
        this.venditaData = venditaData;
    }

    public LocalDate getVenditaScadenza() {
        return venditaScadenza;
    }

    public void setVenditaScadenza(LocalDate venditaScadenza) {
        this.venditaScadenza = venditaScadenza;
    }

}

