package com.babyboom.services;

import com.babyboom.entities.ControlVacunacion;
import com.babyboom.entities.Servicio;

import java.util.List;

public interface IControlVacunacionService {
    public void insert(ControlVacunacion controlvacunacion);
    List<ControlVacunacion> list();
    public void delete(int idControlVacunacion);
    public ControlVacunacion listId(int idControlVacunacion);
}
