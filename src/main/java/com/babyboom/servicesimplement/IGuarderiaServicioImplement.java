package com.babyboom.servicesimplement;

import com.babyboom.entities.GuarderiaServicio;
import com.babyboom.entities.Problema;
import com.babyboom.repositories.IGuarderiaRepository;
import com.babyboom.repositories.IGuarderiaServicioRepository;
import com.babyboom.services.IGuarderiaService;
import com.babyboom.services.IGuarderiaServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IGuarderiaServicioImplement implements IGuarderiaServicioService {
    @Autowired
    private IGuarderiaServicioRepository gR;


    @Override
    public List<GuarderiaServicio> list() {
        return gR.findAll();
    }
}
