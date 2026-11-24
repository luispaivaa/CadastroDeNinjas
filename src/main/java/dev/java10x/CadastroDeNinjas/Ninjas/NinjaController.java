package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {
    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é a primeira mensagem nessa rota";
    }

    // add ninja (CREATE)
    @PostMapping("/add")
    public String addNinja(){
        return "Ninja criado";
    }

    // show all ninjas (READ)
    @GetMapping("/list")
    public List<NinjaModel> listNinjas(){
        return ninjaService.listNinjas();
    }

    // show ninja by id (READ)
    @GetMapping("/list/{id}")
    public NinjaModel listById(@PathVariable Long id) {
        return ninjaService.listNinjaById(id);
    }

    // update ninja (UPDATE)
    @PutMapping("/updateid")
    public String updateById() {
        return "Altera ninja por id";
    }

    // delete ninja (DELETE)
    @DeleteMapping("/delete")
    public String deleteById() {
        return "Deleta ninja por id";
    }
}
