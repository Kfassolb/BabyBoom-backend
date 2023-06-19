package com.babyboom.serviciesimplement;

import com.babyboom.entities.GuarderiaServicio;
import com.babyboom.repositories.IGuarderiaServicioRepository;
import com.babyboom.services.IGuarderiaServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GuarderiaServicioImplement implements IGuarderiaServicioService {
    @Autowired
    private IGuarderiaServicioRepository iGSr;
    @Override
    public List<GuarderiaServicio> list() {
        return iGSr.findAll();
    }
}
