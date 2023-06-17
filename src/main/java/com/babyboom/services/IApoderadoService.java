package com.babyboom.services;

import com.babyboom.entities.Apoderado;
import com.babyboom.entities.Bebe;

import java.time.LocalDate;
import java.util.List;

public interface IApoderadoService {
    public void insert(Apoderado apoderado);
    List<Apoderado> list();
    public Apoderado listId(int idBebe);
    public void delete(int idBebe);
}
