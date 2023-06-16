package com.babyboom.servicesimplement;

import com.babyboom.entities.Citamedica;
import com.babyboom.repositories.ICitamedicaRepository;
import com.babyboom.services.ICitamedicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitamedicaServiceImpl implements ICitamedicaService {
    @Autowired
    private ICitamedicaRepository citamedicaR;

    @Override
    public void insert(Citamedica citamedica) {
        citamedicaR.save(citamedica);
    }

    @Override
    public List<Citamedica> list() {
        return citamedicaR.findAll();
    }
}
