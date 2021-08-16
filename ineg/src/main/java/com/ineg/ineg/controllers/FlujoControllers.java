package com.ineg.ineg.controllers;
import com.ineg.ineg.services.FlujoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    @PostRequest ("/ingreso")
    
}

