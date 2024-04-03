package com.cezarNegreiros.compras.repositories;

import com.cezarNegreiros.compras.entities.OrderItem;
import com.cezarNegreiros.compras.entities.pk.OrderItemPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository  extends JpaRepository<OrderItem, OrderItemPk> {
}
