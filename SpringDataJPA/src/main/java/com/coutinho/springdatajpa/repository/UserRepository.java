package com.coutinho.springdatajpa.repository;

import com.coutinho.springdatajpa.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Usuario, Integer> {
}
