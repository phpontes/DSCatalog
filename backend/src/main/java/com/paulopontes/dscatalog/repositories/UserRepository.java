package com.paulopontes.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulopontes.dscatalog.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
