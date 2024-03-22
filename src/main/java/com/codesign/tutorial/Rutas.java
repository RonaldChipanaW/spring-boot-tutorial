package com.codesign.tutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rutas {
    @GetMapping("/hola")
    String miPrimeraRuta(){
        return "Hola mundo desde Spring Controller :)";
    }

    @GetMapping("/libro/{id}/nombre/{nombre}")
    String leerLibro(@PathVariable int id, @PathVariable String nombre){
        return "Leyendo el libro con id:" + id + ", de nombre: " + nombre;
    }
}
