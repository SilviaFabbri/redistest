package it.sinapsi.redistest.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class VenditaDto implements Serializable {
    private String ragioneSociale;

    private String indirizzo;

    private LocalDateTime venditaData = LocalDateTime.now();

    private LocalDateTime venditaScadenza = LocalDateTime.now().plusMonths(3);

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

