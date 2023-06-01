package it.sinapsi.redistest.business;

import it.sinapsi.redistest.RedistestApplication;
import it.sinapsi.redistest.model.VenditaPostgres;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.OPTIONAL;
import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
class PagamentoTest {
    Pagamento pagamento = new Pagamento();
    @Test
    public void shouldReturnCorrectList() throws NullPointerException {
        List<VenditaPostgres> vendite = new ArrayList<>();
        List<VenditaPostgres> venditeFiltrate = new ArrayList<>();
        VenditaPostgres venditaP = new VenditaPostgres();
        venditaP.setId(UUID.randomUUID());
        venditaP.setRagioneSociale("Iona Corolla");
        venditaP.setIndirizzo("San Felicia");
        venditaP.setVenditaData(LocalDateTime.now());
        venditaP.setVenditaScadenza(LocalDateTime.now().plusMonths(3));
        venditaP.setPagate(true);
        VenditaPostgres venditaPo = new VenditaPostgres();
        venditaPo.setId(UUID.randomUUID());
        venditaPo.setRagioneSociale("Iona Corolla");
        venditaPo.setIndirizzo("San Felicia");
        venditaPo.setVenditaData(LocalDateTime.now());
        venditaPo.setVenditaScadenza(LocalDateTime.now().plusMonths(3));
        venditaPo.setPagate(false);
        vendite.add(venditaP);
        vendite.add(venditaPo);

        List<VenditaPostgres> listaFiltrata = pagamento.filtroPagato(vendite);
        venditeFiltrate.add(venditaP);

        assertThat(listaFiltrata).isEqualTo(venditeFiltrate);
    }

    @Test
    public void shouldReturnEmptyList() throws NullPointerException {
        List<VenditaPostgres> vendite = new ArrayList<>();
        VenditaPostgres venditaP = new VenditaPostgres();
        venditaP.setId(UUID.randomUUID());
        venditaP.setRagioneSociale("Iona Corolla");
        venditaP.setIndirizzo("San Felicia");
        venditaP.setVenditaData(LocalDateTime.now());
        venditaP.setVenditaScadenza(LocalDateTime.now().plusMonths(3));
        venditaP.setPagate(false);
        VenditaPostgres venditaPo = new VenditaPostgres();
        venditaPo.setId(UUID.randomUUID());
        venditaPo.setRagioneSociale("Iona Corolla");
        venditaPo.setIndirizzo("San Felicia");
        venditaPo.setVenditaData(LocalDateTime.now());
        venditaPo.setVenditaScadenza(LocalDateTime.now().plusMonths(3));
        venditaPo.setPagate(false);
        vendite.add(venditaP);
        vendite.add(venditaPo);
        List<VenditaPostgres> listaFiltrata = pagamento.filtroPagato(vendite);

        assertThat(listaFiltrata).isEqualTo( new ArrayList<>());
    }
    @Test
    public void shouldReturnEmptyListInsteadNull() throws NullPointerException {
       List<VenditaPostgres> listanulla = null;
        List<VenditaPostgres> listaFiltrata = pagamento.filtroPagato(listanulla);

        assertThat(listaFiltrata).isEqualTo(new ArrayList<>());
    }



}