package it.sinapsi.redistest.dao;

import it.sinapsi.redistest.model.Vendita;
import jakarta.annotation.Resource;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.stereotype.Repository;

import java.util.Map;
@Repository
public class VenditaDaoImplementazione implements VenditaDao {
    private final String hashRiferimento = "Vendita";

    @Resource(name="redisTemplate")
    private HashOperations<String, Long, Vendita> hashOperations;

    @Override
    public void saveVendita(Vendita vendita){
        hashOperations.putIfAbsent(hashRiferimento, vendita.getVenditaId(), vendita);
    }
    @Override
    public void saveAllVendita(Map<Long, Vendita> map){
        hashOperations.putAll(hashRiferimento, map);
    }
    @Override
    public Vendita getUnaVendita(Long id){
        return  hashOperations.get(hashRiferimento, id);
    }
    @Override
    public void updateVendita(Vendita vendita){
        hashOperations.put(hashRiferimento, vendita.getVenditaId(), vendita);
    }
    @Override
    public Map<Long, Vendita> getAllVendita(){
        return hashOperations.entries(hashRiferimento);
    }
    @Override
    public void deleteVendita(Long id){
        hashOperations.delete(hashRiferimento, id);
    }

}
