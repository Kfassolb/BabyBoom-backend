package com.babyboom.services;

import com.babyboom.entities.Citamedica;

import java.util.List;

public interface ICitamedicaService {
    public void insert(Citamedica citamedica);
    List<Citamedica> list();
}