package com.babyboom.servicesimplement;

import com.babyboom.entities.Tiposuscrip;
import com.babyboom.repositories.ITiposuscripRepository;
import com.babyboom.services.ITiposuscripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiposuscripServiceImplement implements ITiposuscripService {
    @Autowired
    private ITiposuscripRepository sR;

    @Override
    public void insert(Tiposuscrip tiposuscrip) {
        sR.save(tiposuscrip);
    }

    @Override
    public List<Tiposuscrip> list() {
        return sR.findAll();
    }

    @Override
    public void delete(int idTiposuscrip) {
        sR.deleteById(idTiposuscrip);
    }

    @Override
    public Tiposuscrip listId(int IdTiposuscrip) {
        return sR.findById(IdTiposuscrip).orElse(new Tiposuscrip());
    }

}
