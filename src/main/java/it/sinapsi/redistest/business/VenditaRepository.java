package it.sinapsi.redistest.business;

import it.sinapsi.redistest.model.Vendita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenditaRepository extends JpaRepository<Vendita, String> {
}
