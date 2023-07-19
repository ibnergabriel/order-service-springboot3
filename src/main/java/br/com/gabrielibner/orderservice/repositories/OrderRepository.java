package br.com.gabrielibner.orderservice.repositories;

import br.com.gabrielibner.orderservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
