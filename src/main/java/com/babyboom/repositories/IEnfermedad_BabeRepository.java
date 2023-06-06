package com.babyboom.repositories;

import com.babyboom.entities.Enfermedad_bebe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEnfermedad_BabeRepository extends JpaRepository<Enfermedad_bebe,Integer> {


}
