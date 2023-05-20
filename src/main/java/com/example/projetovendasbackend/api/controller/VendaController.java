package com.example.projetovendasbackend.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class VendaController {


    @GetMapping("/vendas")
    public String vendaList() {
        return "Hello World!";
    }
}
