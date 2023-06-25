package com.babyboom.servicesimplement;

import com.babyboom.entities.Comunidad;
import com.babyboom.repositories.IComunidadRepository;
import com.babyboom.services.IComunidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ComunidadServicesImplement implements IComunidadService {
    @Autowired
    private IComunidadRepository cR;
    @Override
    public void insert(Comunidad comunidad) {
        cR.save(comunidad);
    }
    @Override
    public List<Comunidad> list() {
        return cR.findAll();
    }
    @Override
    public void delete(int idComunidad){cR.deleteById(idComunidad);}
    @Override
    public Comunidad listId(int IdComunidad){return cR.findById(IdComunidad).orElse(new Comunidad());}

    @Override
    public List<Comunidad> findByDateComunidad(LocalDate fechaInicio) {
        return cR.findByDateComunidad(fechaInicio);
    }

}
