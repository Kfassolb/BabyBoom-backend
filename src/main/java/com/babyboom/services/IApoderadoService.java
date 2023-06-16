package com.babyboom.services;

import com.babyboom.entities.Apoderado;

import java.util.List;

public interface IApoderadoService {
    public void insert(Apoderado apoderado);
    List<Apoderado> list();
    public void delete(int idApoderado);
    public Apoderado listId(int idApoderado);
}
