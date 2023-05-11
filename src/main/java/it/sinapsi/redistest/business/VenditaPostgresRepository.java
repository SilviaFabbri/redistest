package it.sinapsi.redistest.business;

import it.sinapsi.redistest.model.VenditaPostgres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface VenditaPostgresRepository extends JpaRepository<VenditaPostgres, String> {
   List<VenditaPostgres> findVenditaPostgresByVenditaData(LocalDate dataVendita);
   List<VenditaPostgres> findVenditaPostgresByRagioneSociale(String ragioneSociale);
}
