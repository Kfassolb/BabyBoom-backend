package com.babyboom.services;

import com.babyboom.entities.Bebe;
import com.babyboom.entities.TipoEnfermedad;

import java.util.List;

public interface IBebeService {
    public void insert(Bebe bebe);
    List<Bebe> list();
    public void delete(int idBebe);
    public Bebe listId(int idBebe);
}
