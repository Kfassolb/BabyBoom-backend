package com.babyboom.servicesimplement;
import com.babyboom.entities.Problema;
import com.babyboom.repositories.IProblemaRepository;
import com.babyboom.services.IProblemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ProblemaServiceImplement implements IProblemaService {

    @Autowired
    private IProblemaRepository pR;

    @Override
    public void insert(Problema problema) {
        pR.save(problema);}

    @Override
    public List<Problema> list() {
        return pR.findAll();
    }

    @Override
    public List<Problema> findByApoderado(int idApoderado) {
        return pR.findByApoderado(idApoderado);
    }
}