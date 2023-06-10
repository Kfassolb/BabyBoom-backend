package com.babyboom.services;

import com.babyboom.entities.TipoEnfermedad;
import java.util.List;

public interface ITipoEnfermedadService {
    public void insert(TipoEnfermedad tipoEnfermedad);
    List<TipoEnfermedad> list();
    public void delete(int idTipoEnfermedad);
    public TipoEnfermedad listId(int idTipoEnfermedad);

    void save(TipoEnfermedad tipoEnfermedad);
}
