package it.sinapsi.redistest.Dao;

import it.sinapsi.redistest.business.VenditaPostgresRepository;
import it.sinapsi.redistest.business.VenditaRepository;
import it.sinapsi.redistest.dto.VenditaDto;
import it.sinapsi.redistest.model.Vendita;
import it.sinapsi.redistest.model.VenditaPostgres;
import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Locale;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import static java.lang.Math.random;

@Service
public class VenditaDao {
    @Autowired
    private VenditaRepository venditaRepository;
    @Autowired
    private VenditaPostgresRepository venditaPostgresRepository;

    //INSERIMENTO DATI A PALLA
    Faker faker = new Faker(Locale.ITALIAN);
    Random random = new Random();

    public void create(VenditaDto venditaDto) {
        for (int i = 1; i <= 20000; i++) {
            UUID uuid = UUID.randomUUID();
            Vendita vendita = new Vendita();
            vendita.setId(uuid);
            vendita.setRagioneSociale(faker.funnyName().name());
            vendita.setIndirizzo(faker.address().cityName());
            vendita.setVenditaData(faker.date().past(30, TimeUnit.DAYS).toLocalDateTime());
            vendita.setVenditaScadenza(faker.date().future(30, TimeUnit.DAYS).toLocalDateTime());
            vendita.setPagate(random.nextBoolean());

           this.venditaRepository.save(vendita);

          }
        System.err.println("vendita");
    }

   /*public Vendita create(VenditaDto venditaDto){
        UUID uuid = UUID.randomUUID();
        Vendita vendita = new Vendita();
        vendita.setId(uuid);
        vendita.setRagioneSociale(venditaDto.getRagioneSociale());
        vendita.setIndirizzo(venditaDto.getIndirizzo());
        vendita.setVenditaData(venditaDto.getVenditaData());
        vendita.setVenditaScadenza(venditaDto.getVenditaScadenza());
        vendita.setPagate(venditaDto.isPagate());
        try{
            return this.venditaRepository.save(vendita);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }*/
    public void createPostgres(Vendita vendita){
        VenditaPostgres venditaP = new VenditaPostgres();
        venditaP.setId(vendita.getId());
        venditaP.setRagioneSociale(vendita.getRagioneSociale());
        venditaP.setIndirizzo(vendita.getIndirizzo());
        venditaP.setVenditaData(vendita.getVenditaData());
        venditaP.setVenditaScadenza(vendita.getVenditaScadenza());
        venditaP.setPagate(vendita.isPagate());
        try{
            this.venditaPostgresRepository.save(venditaP);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

}
