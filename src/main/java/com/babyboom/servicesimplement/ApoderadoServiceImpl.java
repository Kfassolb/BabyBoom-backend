package com.babyboom.servicesimplement;

import com.babyboom.entities.Apoderado;
import com.babyboom.repositories.IApoderadoRepository;
import com.babyboom.services.IApoderadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ApoderadoServiceImpl implements IApoderadoService {

    @Autowired
    public IApoderadoRepository aR;
    @java.lang.Override
    public void insert(Apoderado apoderado) {
        aR.save(apoderado);
    }

    @java.lang.Override
    public List<Apoderado> list() {
        return aR.findAll();
    }

    @java.lang.Override
    public Apoderado listId(int idBebe) {
        return aR.findById(idBebe).orElse(new Apoderado());
    }

    @java.lang.Override
    public void delete(int idBebe) {
        aR.deleteById(idBebe);
    }
}
