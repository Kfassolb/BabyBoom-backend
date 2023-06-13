package com.babyboom.services;

import com.babyboom.entities.Bebe;
import com.babyboom.entities.Enfermedad_bebe;

import java.util.List;

public interface IEnfermedad_BebeService {
    public void insert(Enfermedad_bebe enfermedad_bebe);
    List<Enfermedad_bebe> list();
    public void delete(long id);
    public Enfermedad_bebe listId(long id);


}
