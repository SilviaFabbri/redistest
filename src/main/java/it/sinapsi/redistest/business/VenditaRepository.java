package it.sinapsi.redistest.business;

import it.sinapsi.redistest.model.Vendita;
import org.springframework.data.keyvalue.repository.KeyValueRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface VenditaRepository extends KeyValueRepository<Vendita, String> {
}
