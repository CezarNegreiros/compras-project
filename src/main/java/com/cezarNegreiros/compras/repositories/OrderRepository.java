package com.cezarNegreiros.compras.repositories;

import com.cezarNegreiros.compras.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
