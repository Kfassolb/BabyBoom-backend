package com.babyboom.servicesimplement;


import com.babyboom.entities.Enfermedad_bebe;
import com.babyboom.repositories.IEnfermedad_bebeRepository;
import com.babyboom.services.IEnfermedad_BebeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class Enfermedad_bebeServiceImplement implements IEnfermedad_BebeService {
    @Autowired
    private IEnfermedad_bebeRepository fR;


    @Override
    public void insert(Enfermedad_bebe enfermedad_bebe) {
        fR.save(enfermedad_bebe);
    }

    @Override
    public List<Enfermedad_bebe> list() {
        return fR.findAll();
    }

    @Override
    public void delete(int id) {
        fR.deleteById((int) id);

    }

    @Override
    public Enfermedad_bebe listId(int idEnfermedadBebe) {
        return fR.findById((int) idEnfermedadBebe).orElse(new Enfermedad_bebe());
    }
}
