package com.example.servicio1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class IdentityController {

    // Simulación de una base de datos con CIs
    private final List<String> ciDatabase = Arrays.asList("12345678", "87654321", "11223344");

    @GetMapping("/checkCI")
    public String checkCI(@RequestParam String ci) {
        // Verificar si el CI está en la base de datos
        if (ciDatabase.contains(ci)) {
            return "El CI " + ci + " existe.";
        } else {
            return "El CI " + ci + " no existe.";
        }
    }
}