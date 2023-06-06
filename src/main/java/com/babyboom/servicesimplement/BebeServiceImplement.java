package com.babyboom.servicesimplement;

import com.babyboom.entities.Bebe;
import com.babyboom.repositories.IBebeRepository;
import com.babyboom.services.IBebeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class BebeServiceImplement implements IBebeService {
    @Autowired
    private IBebeRepository bR;
    @Override
    public void insert(Bebe bebe) {
        bR.save(bebe);
    }

    @Override
    public List<Bebe> list() {
        return bR.findAll();
    }

    @Override
    public void delete(int idBebe) {
          bR.deleteById(idBebe);
    }

    @Override
    public Bebe listId(int idBebe) {
        return bR.findById(idBebe).orElse(new Bebe());
    }

    @Override
    public List<Bebe> findByFechaBebe(LocalDate fecha) {
    return bR.findByFechaBebe(fecha);
    }
}
