package com.paulopontes.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulopontes.dscatalog.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
