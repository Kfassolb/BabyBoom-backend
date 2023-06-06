package com.babyboom.servicesimplement;

import com.babyboom.entities.Bebe;
import com.babyboom.repositories.IBebeRepository;
import com.babyboom.services.IBebeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
}
