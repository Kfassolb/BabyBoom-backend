package com.babyboom.repositories;

import com.babyboom.entities.BebeVacuna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IBebeVacunaRepository extends JpaRepository <BebeVacuna,Integer> {
}
