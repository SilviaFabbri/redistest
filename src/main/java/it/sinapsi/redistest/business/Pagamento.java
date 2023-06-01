package it.sinapsi.redistest.business;

import it.sinapsi.redistest.model.VenditaPostgres;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class Pagamento{

    public List<VenditaPostgres> filtroPagato(List<VenditaPostgres> all) {
        List<VenditaPostgres> vendite = new ArrayList<>();
        if(all == null){
            return vendite;
        }
        for(VenditaPostgres vendita: all ){
            if(vendita.isPagate()){
                vendite.add(vendita);
            }
        }
        return vendite;
    }
}
