package com.babyboom.servicesimplement;

import com.babyboom.entities.TipoEnfermedad;
import com.babyboom.services.ITipoEnfermedadService;
import com.babyboom.services.ITipoEnfermedadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoEnfermedadServiceImplement implements ITipoEnfermedadService {
    @Autowired
    private ITipoEnfermedadService pR;
    @Override
    public void insert(TipoEnfermedad tipoEnfermedad){pR.save(tipoEnfermedad);}
    @Override
    public List<TipoEnfermedad> list(){return pR.findAll();}

    public void delete(int idTipoEnfermedad){
        pR.deleteById(idTipoEnfermedad);
    }

    public TipoEnfermedad listId(int IdTipoEnfermedad){
        return pR.findById(IdTipoEnfermedad).orElse(new TipoEnfermedad());
    }
}
