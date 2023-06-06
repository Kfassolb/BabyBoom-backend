package com.babyboom.repositories;

import com.babyboom.entities.Bebe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBebeRepository extends JpaRepository<Bebe,Integer> {

}
