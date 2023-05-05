package it.sinapsi.redistest.business;

import it.sinapsi.redistest.model.Vendita;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendita")
public class VenditaManager {
    private final VenditaRepository venditaRepository;

    public VenditaManager(VenditaRepository venditaRepository){
        this.venditaRepository = venditaRepository;
    }
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Vendita createVendita(@RequestBody Vendita vendita){
        return venditaRepository.save(vendita);
    }
    @GetMapping()
    public Iterable<Vendita> findAllVendita(){
        return venditaRepository.findAll();
    }
}
