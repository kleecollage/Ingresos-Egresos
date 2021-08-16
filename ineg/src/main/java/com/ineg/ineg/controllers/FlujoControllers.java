package com.ineg.ineg.controllers;
import com.ineg.ineg.models.Flujo;
import com.ineg.ineg.services.FlujoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flujo")

public class FlujoControllers {
    @Autowired
    FlujoService flujoService;

    @RequestMapping (value = "/saldo", method = RequestMethod.GET)
    public List getSaldo() {

        return flujoService.getSaldoFromDB() ;
    }

    @PostMapping ("/ingreso")
    public Flujo newIngreso (@RequestBody  Flujo flujo) {
        return flujoService.ingreso ( flujo ) ;
    }

    @PostMapping ("/egreso")
    public Flujo newEgreso (@RequestBody Flujo flujo) {
    return flujoService.egreso ( flujo ) ;
    }
}

