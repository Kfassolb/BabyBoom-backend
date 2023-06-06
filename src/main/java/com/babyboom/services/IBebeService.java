package com.babyboom.services;

import com.babyboom.entities.Bebe;

import java.time.LocalDate;
import java.util.List;

public interface IBebeService {
    public void insert(Bebe bebe);
    List<Bebe> list();
    public void delete(int idBebe);
    public Bebe listId(int idBebe);

    List<Bebe> findByFechaBebe (LocalDate fecha);
}
