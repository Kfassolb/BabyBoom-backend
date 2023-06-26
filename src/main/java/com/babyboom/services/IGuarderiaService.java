package com.babyboom.services;

import com.babyboom.dtos.GuarderiaSideDTO;
import com.babyboom.entities.Guarderia;

import java.util.List;

public interface IGuarderiaService {
    public void insert(Guarderia guarderia);

    List<Guarderia>list();

    public void delete(int idGuarderia);

    public Guarderia listId(int idGuarderia);


}
