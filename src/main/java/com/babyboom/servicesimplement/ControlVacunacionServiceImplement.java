package com.babyboom.servicesimplement;

import com.babyboom.entities.ControlVacunacion;
import com.babyboom.repositories.IControlVacunacionRepository;
import com.babyboom.services.IControlVacunacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ControlVacunacionServiceImplement implements IControlVacunacionService {
    @Autowired
    private IControlVacunacionRepository iCVr;
    @java.lang.Override
    public void insert(ControlVacunacion controlvacunacion) {
        iCVr.save(controlvacunacion);
    }
    @java.lang.Override
    public List<ControlVacunacion> list() {
        return iCVr.findAll();
    }
    @java.lang.Override
    public void delete(int idControlVacunacion){
        iCVr.findById(idControlVacunacion);
    }
    @java.lang.Override
    public ControlVacunacion listId(int idControlVacunacion) {
        return iCVr.findById(idControlVacunacion).orElse(new ControlVacunacion());
    }
}
