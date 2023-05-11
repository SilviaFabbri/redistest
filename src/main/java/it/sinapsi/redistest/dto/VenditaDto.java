package it.sinapsi.redistest.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

public class VenditaDto implements Serializable {
    private String ragioneSociale;

    private String indirizzo;

    private LocalDate venditaData = LocalDate.now();

    private LocalDate venditaScadenza = LocalDate.now().plusMonths(3);

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

