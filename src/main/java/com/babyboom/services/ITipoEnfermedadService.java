package com.babyboom.services;

import com.babyboom.entities.TipoEnfermedad;
import com.babyboom.entities.Bebe;

import java.util.List;

public interface ITipoEnfermedadService {
    public void insert(TipoEnfermedad tipoEnfermedad);
    List<TipoEnfermedad> list();
    public void delete(int idTipoEnfermedad);
    public TipoEnfermedad listId(int idTipoEnfermedad);

    List<TipoEnfermedad> findByTipoTipoEnfermedad (String tipoTipoEnfermedad);

    List<Bebe> findBebesConEnfermedad(String nombreTipoEnfermedad);
}
