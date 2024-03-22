package com.codesign.tutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rutas {
    @GetMapping("/hola")
    String miPrimeraRuta(){
        return "Hola mundo desde Spring Controller :)";
    }
}
