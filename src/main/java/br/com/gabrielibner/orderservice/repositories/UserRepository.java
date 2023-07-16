package br.com.gabrielibner.orderservice.repositories;

import br.com.gabrielibner.orderservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
