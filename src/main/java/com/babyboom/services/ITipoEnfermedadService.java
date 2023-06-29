package com.babyboom.services;

import com.babyboom.dtos.ReporteEnfermedadBebeDTO;
import com.babyboom.dtos.ReporteEnfermedadDTO;
import com.babyboom.entities.Bebe;
import com.babyboom.entities.TipoEnfermedad;

import java.util.List;

public interface ITipoEnfermedadService {
    public void insert(TipoEnfermedad tipoEnfermedad);
    List<TipoEnfermedad> list();
    public void delete(int idTipoEnfermedad);
    public TipoEnfermedad listId(int idTipoEnfermedad);

    List<ReporteEnfermedadDTO> findByTipoTipoEnfermedad (String tipoTipoEnfermedad);



}
