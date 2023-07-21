package br.com.gabrielibner.orderservice.repositories;

import br.com.gabrielibner.orderservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
