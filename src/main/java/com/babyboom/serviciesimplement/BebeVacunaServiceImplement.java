package com.babyboom.serviciesimplement;

import com.babyboom.entities.BebeVacuna;
import com.babyboom.repositories.IBebeVacunaRepository;
import com.babyboom.servicies.IBebeVacunaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BebeVacunaServiceImplement implements IBebeVacunaService {
    @Autowired
    private IBebeVacunaRepository iBVr;
    @Override
    public void insert(BebeVacuna bebeVacuna) {
        iBVr.save(bebeVacuna);
    }
    @Override
    public List<BebeVacuna> list() {
        return iBVr.findAll();
    }
}
