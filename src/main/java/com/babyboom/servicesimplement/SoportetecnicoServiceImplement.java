package com.babyboom.servicesimplement;

import com.babyboom.entities.Soportetecnico;
import com.babyboom.repositories.ISoportetecnicoRepository;
import com.babyboom.services.ISoportetecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SoportetecnicoServiceImplement implements ISoportetecnicoService {
    @Autowired
    private ISoportetecnicoRepository tR;

    @Override
    public void insert(Soportetecnico soportetecnico){tR.save(soportetecnico); }

    @Override
    public List<Soportetecnico> list(){return tR.findAll();}

    @Override
    public void delete(int idSoportetecnico){tR.deleteById(idSoportetecnico); }

    @Override
    public Soportetecnico listId(int IdSoportetecnico){return tR.findById(IdSoportetecnico).orElse(new Soportetecnico()); }

}

