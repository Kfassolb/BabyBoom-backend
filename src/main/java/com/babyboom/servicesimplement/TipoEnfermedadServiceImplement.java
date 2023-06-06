package com.babyboom.servicesimplement;

import com.babyboom.entities.TipoEnfermedad;
import com.babyboom.repositories.ITipoEnfermedadRepository;
import com.babyboom.services.ITipoEnfermedadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoEnfermedadServiceImplement implements ITipoEnfermedadService {
    @Autowired
    private ITipoEnfermedadRepository pR;
    @Override
    public void insert(TipoEnfermedad tipoEnfermedad){pR.save(tipoEnfermedad);}
    @Override
    public List <TipoEnfermedad> list(){return pR.findAll();}

    public void delete(int idTipoEnfermedad){
        pR.deleteById(idTipoEnfermedad);
    }

    public TipoEnfermedad listId(int IdTipoEnfermedad){
        return pR.findById(IdTipoEnfermedad).orElse(new TipoEnfermedad());
    }

}
