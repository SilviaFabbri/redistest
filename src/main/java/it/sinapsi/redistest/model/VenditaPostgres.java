package it.sinapsi.redistest.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "vendita")
public class VenditaPostgres implements Serializable {
    @jakarta.persistence.Id
    private UUID Id;
    @Column(nullable = false)
    private String ragioneSociale;
    @Column(nullable = false)
    private String indirizzo;
    @Column(nullable = false)
    private LocalDateTime venditaData = LocalDateTime.now();
    @Column(nullable = false)
    private LocalDateTime venditaScadenza = LocalDateTime.now().plusMonths(3);

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

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public LocalDateTime getVenditaData() {
        return venditaData;
    }

    public void setVenditaData(LocalDateTime venditaData) {
        this.venditaData = venditaData;
    }

    public LocalDateTime getVenditaScadenza() {
        return venditaScadenza;
    }

    public void setVenditaScadenza(LocalDateTime venditaScadenza) {
        this.venditaScadenza = venditaScadenza;
    }

}

