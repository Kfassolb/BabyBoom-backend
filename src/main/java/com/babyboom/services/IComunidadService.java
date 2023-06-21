package com.babyboom.services;

import com.babyboom.entities.Comunidad;

import java.util.List;

public interface IComunidadService {
    public void insert(Comunidad comunidad);
    List<Comunidad> list();
    public void delete(int idComunidad );

    public Comunidad listId(int IdComunidad );
}
