package it.sinapsi.redistest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.time.LocalDate;

@RedisHash("vendita")
public class Vendita implements Serializable {
    @Id
    private Long venditaId;
    private String ragioneSociale;
    private Long pIva;
    private String indirizzo;
    private LocalDate venditaData;
    private LocalDate venditaScadenza;

    public Long getVenditaId() {
        return venditaId;
    }

    public void setVenditaId(Long venditaId) {
        this.venditaId = venditaId;
    }

    public String getRagioneSociale() {
        return ragioneSociale;
    }

    public void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }

    public Long getpIva() {
        return pIva;
    }

    public void setpIva(Long pIva) {
        this.pIva = pIva;
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

