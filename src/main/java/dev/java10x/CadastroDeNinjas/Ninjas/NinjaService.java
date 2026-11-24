package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {
    private NinjaRepository ninjaRepository;
    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Show all ninjas
    public List<NinjaModel> listNinjas() {
        return ninjaRepository.findAll();
    }

    public NinjaModel listNinjaById(Long id){
        Optional<NinjaModel> ninjaById= ninjaRepository.findById(id);
        return ninjaById.orElse(null);
    }

}
