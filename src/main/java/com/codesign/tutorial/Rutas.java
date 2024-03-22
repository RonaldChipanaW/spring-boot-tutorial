package com.codesign.tutorial;

import com.codesign.tutorial.models.Libro;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class Rutas {

    private final Logger logger = LoggerFactory.getLogger(Rutas.class);
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

/*
    @PostMapping("/libro")
    String guardarLibro(@RequestBody Map<String, Object> libro){
        logger.debug("Starter_guardarLibro");
        libro.keySet().forEach( llave -> {
            logger.debug("llave {} valor {}", llave, libro.get(llave));
        });

        return "libros gusardados";
    }
*/
    @PostMapping("/libro")
    String guardarLibro(@RequestBody Libro libro){
        logger.debug("Starter_guardarLibro");

            logger.debug("libro {} editorial {}", libro.nombre, libro.editorial);


        return "libros gusardados";
    }
}
