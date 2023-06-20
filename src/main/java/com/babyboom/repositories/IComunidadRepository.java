package com.babyboom.repositories;

import com.babyboom.entities.Comunidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IComunidadRepository extends JpaRepository<Comunidad, Integer> {
}
