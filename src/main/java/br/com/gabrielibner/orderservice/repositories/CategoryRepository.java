package br.com.gabrielibner.orderservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gabrielibner.orderservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
