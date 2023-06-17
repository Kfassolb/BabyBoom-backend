package com.babyboom.servicesimplement;

import com.babyboom.entities.Publicacion;
import com.babyboom.repositories.IPublicacionRepository;
import com.babyboom.services.IPublicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PublicacionServicesImplement implements IPublicacionService {
    @Autowired
    private IPublicacionRepository pR;

    @Override
    public void insert(Publicacion publicacion) {
pR.save(publicacion);
    }

    @Override
    public List<Publicacion> list() {
        return pR.findAll();
    }
}
