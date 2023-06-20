package com.babyboom.repositories;

import com.babyboom.entities.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPublicacionRepository extends JpaRepository<Publicacion, Integer> {
}
