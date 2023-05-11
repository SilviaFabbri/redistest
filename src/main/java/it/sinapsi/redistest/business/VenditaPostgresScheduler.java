package it.sinapsi.redistest.business;

import it.sinapsi.redistest.Dao.VenditaDao;
import it.sinapsi.redistest.model.Vendita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@EnableScheduling
public class VenditaPostgresScheduler {

    @Autowired
    private VenditaRepository venditaRepository;
    @Autowired
    private VenditaDao venditaDao;
    public Iterable<Vendita> findAllVendita(){
        return venditaRepository.findAll();
    }
    @Scheduled(fixedDelay = 60000)
    public void scheduleFixedDelayTask() {
        //System.out.println( "Fixed rate task - " + System.currentTimeMillis() / 10000);
        for (Vendita vendita: findAllVendita()) {
                venditaDao.createPostgres(vendita);
                venditaRepository.delete(vendita);
        }
    }
}
