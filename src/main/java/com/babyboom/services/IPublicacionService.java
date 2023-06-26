package com.babyboom.services;

import com.babyboom.dtos.PublicacionComunidadDTO;
import com.babyboom.entities.Publicacion;

import java.util.List;

public interface IPublicacionService {
    public void insert(Publicacion publicacion);
    List<Publicacion> list();
public List<PublicacionComunidadDTO> reporte01();
}
