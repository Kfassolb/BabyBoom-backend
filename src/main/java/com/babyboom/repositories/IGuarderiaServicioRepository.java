package com.babyboom.repositories;

import com.babyboom.entities.GuarderiaServicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGuarderiaServicioRepository extends JpaRepository<GuarderiaServicio,Integer> {
}
