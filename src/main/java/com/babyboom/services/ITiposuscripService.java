package com.babyboom.services;

import com.babyboom.entities.Tiposuscrip;

import java.util.List;

public interface ITiposuscripService {
    public void insert(Tiposuscrip tiposuscrip);
    List<Tiposuscrip> list();
    public void delete(int idTiposuscrip );

    public Tiposuscrip listId(int IdTiposuscrip );

}
