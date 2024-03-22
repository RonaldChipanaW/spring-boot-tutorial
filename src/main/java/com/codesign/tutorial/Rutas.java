package com.codesign.tutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/libro2/{id}")
    String leerLibro2(@PathVariable int id, @RequestParam String params, @RequestParam String editorial){
        return "Leyendo el libro2 con id:" + id + ", params: " + params + ", de editorial: " + editorial;
    }
}
