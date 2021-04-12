package com.tm.caj.web;

import com.caj.tm.model.Suma;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorSuma {

    @GetMapping("/")
    public String iniciar(Suma suma) {
        return "index";
    }

    @GetMapping("/sumar")
    public String sumar(Suma suma) {
        log.info("La suma es en el método iniciar es: " + suma.toString());
        return "resultado";
    }
}




