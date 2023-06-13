package com.babyboom.repositories;

import com.babyboom.entities.Tiposuscrip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITiposuscripRepository extends JpaRepository <Tiposuscrip,Integer> {
}
