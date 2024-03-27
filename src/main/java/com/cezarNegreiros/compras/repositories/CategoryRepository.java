package com.cezarNegreiros.compras.repositories;

import com.cezarNegreiros.compras.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
