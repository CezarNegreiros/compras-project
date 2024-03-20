package com.cezarNegreiros.compras.repositories;

import com.cezarNegreiros.compras.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
