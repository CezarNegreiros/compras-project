package com.cezarNegreiros.compras.repositories;

import com.cezarNegreiros.compras.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
