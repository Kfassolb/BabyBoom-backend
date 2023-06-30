package com.babyboom.services;

import com.babyboom.entities.BebeVacuna;
import com.babyboom.entities.Citamedica;

import java.util.List;

public interface IBebeVacunaService {
    List<BebeVacuna> list();
    public void insert(BebeVacuna bebeVacuna);
}
