package com.babyboom.repositories;

import com.babyboom.entities.Citamedica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICitamedicaRepository extends JpaRepository<Citamedica,Integer> {
}
