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
    private IApoderadoRepository apoderadoRepository;
    @Override
    public void insert(Apoderado apoderado) {
        apoderadoRepository.save(apoderado);
    }

    @Override
    public List<Apoderado> list() {
        return apoderadoRepository.findAll();
    }

    @Override
    public void delete(int idApoderado) {
        apoderadoRepository.deleteById(idApoderado);
    }

    @Override
    public Apoderado listId(int idApoderado) {
        return apoderadoRepository.findById(idApoderado).orElse(new Apoderado());
    }
}
