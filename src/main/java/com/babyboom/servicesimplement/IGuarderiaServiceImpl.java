package com.babyboom.servicesimplement;

import com.babyboom.entities.Guarderia;
import com.babyboom.repositories.IGuarderiaRepository;
import com.babyboom.services.IGuarderiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IGuarderiaServiceImpl implements IGuarderiaService {
    @Autowired
    private IGuarderiaRepository gR;

    @Override
    public void insert(Guarderia guarderia) {
        gR.save(guarderia);
    }

    @Override
    public List<Guarderia> list() {
        return gR.findAll();
    }

    @Override
    public void delete(int idGuarderia) {
        gR.deleteById(idGuarderia);
    }

    @Override
    public Guarderia listId(int idGuarderia) {
        return gR.findById(idGuarderia).orElse(new Guarderia());
    }
}
