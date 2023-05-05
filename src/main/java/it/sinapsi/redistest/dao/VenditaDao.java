package it.sinapsi.redistest.dao;

import it.sinapsi.redistest.model.Vendita;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface VenditaDao {
    void saveVendita(Vendita vendita);
    Vendita getUnaVendita(Long id);
    void updateVendita(Vendita vendita);
    Map<Long, Vendita> getAllVendita();
    void deleteVendita(Long id);
    void saveAllVendita(Map<Long, Vendita> map);
}
