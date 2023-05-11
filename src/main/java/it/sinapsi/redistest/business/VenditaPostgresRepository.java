package it.sinapsi.redistest.business;

import it.sinapsi.redistest.model.Vendita;
import it.sinapsi.redistest.model.VenditaPostgres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface VenditaPostgresRepository extends JpaRepository<VenditaPostgres, String> {
   List<VenditaPostgres> findByVenditaData(LocalDate dataVendita);
}
