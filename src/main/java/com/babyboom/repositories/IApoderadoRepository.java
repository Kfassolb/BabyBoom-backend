package com.babyboom.repositories;

import com.babyboom.entities.Apoderado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IApoderadoRepository extends JpaRepository<Apoderado, Integer> {
}
