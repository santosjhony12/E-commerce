package com.ecommerce.E_commerce.Repository;

import com.ecommerce.E_commerce.DTO.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    List<Categoria> findAll();
}
