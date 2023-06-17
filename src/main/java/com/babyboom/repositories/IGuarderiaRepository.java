package com.babyboom.repositories;

import com.babyboom.entities.Guarderia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGuarderiaRepository extends JpaRepository<Guarderia,Integer> {
}
