package com.babyboom.serviciesimplement;

import com.babyboom.entities.ControlVacunacion;
import com.babyboom.repositories.IControlVacunacionRepository;
import com.babyboom.servicies.IControlVacunacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ControlVacunacionServiceImplement implements IControlVacunacionService {
    @Autowired
    private IControlVacunacionRepository iCVr;
    @Override
    public void insert(ControlVacunacion controlvacunacion) {
        iCVr.save(controlvacunacion);
    }
    @Override
    public List<ControlVacunacion> list() {
        return iCVr.findAll();
    }
    @Override
    public void delete(int idControlVacunacion){
        iCVr.findById(idControlVacunacion);
    }
    @Override
    public ControlVacunacion listId(int idControlVacunacion) {
        return iCVr.findById(idControlVacunacion).orElse(new ControlVacunacion());
    }
}
