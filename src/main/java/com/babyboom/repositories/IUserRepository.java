package com.babyboom.repositories;

import com.babyboom.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User,Integer> {
    //Dado un username mostrar mostrar la contraseña
}
