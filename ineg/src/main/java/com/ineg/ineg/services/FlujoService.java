package com.ineg.ineg.services;

import com.ineg.ineg.models.Flujo;
import com.ineg.ineg.repository.IFlujoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlujoService {

    @Autowired
    IFlujoRepository flujoRepository ;

    public List getSaldoFromDB() {
        return flujoRepository.findAll();
    }

    public Flujo ingreso (Flujo flujo){
        return flujoRepository.saveAndFlush( flujo ) ;
    }
}

