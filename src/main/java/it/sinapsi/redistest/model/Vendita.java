package it.sinapsi.redistest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;


@RedisHash("vendita")
public class Vendita implements Serializable {
    @Id
    private UUID Id;

    private String ragioneSociale;

    private String indirizzo;

    private LocalDateTime  venditaData = LocalDateTime.now();

    private LocalDateTime venditaScadenza = LocalDateTime.now().plusMonths(3);
    private boolean pagate;

    public boolean isPagate() {
        return pagate;
    }

    public void setPagate(boolean pagate) {
        this.pagate = pagate;
    }

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

