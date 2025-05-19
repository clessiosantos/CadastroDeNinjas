package dev.java10x.CadastroDeNinja.Missoes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MissaoController {

    @GetMapping
    public String Trabalho(){
        return "Esse é o meu primeiro trabalho";

    }
}
