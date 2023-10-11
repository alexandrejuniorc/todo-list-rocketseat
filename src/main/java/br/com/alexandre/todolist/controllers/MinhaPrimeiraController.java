package br.com.alexandre.todolist.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
public class MinhaPrimeiraController {
    
    /**
     * GET - Buscar uma informação
     * POST - Adicionar um dado/informação
     * DELETE - Remover um dado 
     * PUT - Alterar um dado/info
     * PATCH - Alterar somente uma parte da info/dado
     */

    //Método (funcionalidade) de uma classe
    @GetMapping("/")
    public String primeiraMensagem(){
        return "Funcionou";
    }

}
