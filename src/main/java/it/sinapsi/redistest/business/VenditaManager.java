package it.sinapsi.redistest.business;

import it.sinapsi.redistest.Dao.VenditaDao;
import it.sinapsi.redistest.dto.VenditaDto;
import it.sinapsi.redistest.model.Vendita;
import it.sinapsi.redistest.model.VenditaPostgres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/vendita")
public class VenditaManager {
  @Autowired
  private VenditaDao venditaDao;
    @Autowired
    private VenditaRepository venditaRepository;
    @Autowired
    private VenditaPostgresRepository venditaPostgresRepository;

    //qui salva in entrambi
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public HttpStatus createVendita(@RequestBody VenditaDto vendita){
        this.venditaDao.create(vendita);
        return HttpStatus.CREATED;
    }

    //qui lavora su redis
    @GetMapping()
    public Iterable<Vendita> findAllVendita(){
            return venditaRepository.findAll();
    }

    //qui lavora su postgres
    @GetMapping("/{data}")
    public List<VenditaPostgres> findUnaVendita(@PathVariable("data") LocalDate data){
            return venditaPostgresRepository.findByVenditaData(data);
    }
}
