package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

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
    @GetMapping("/all")
    public String getAll(){
        return "Mostra todos os ninjas";
    }

    // show ninja by id (READ)
    @GetMapping("/show-by-id")
    public String getById() {
        return "Mostra ninjas por id";
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
