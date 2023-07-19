package br.com.gabrielibner.orderservice.services;

import br.com.gabrielibner.orderservice.entities.Order;
import br.com.gabrielibner.orderservice.entities.User;
import br.com.gabrielibner.orderservice.repositories.OrderRepository;
import br.com.gabrielibner.orderservice.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = orderRepository.findById(id);
        return obj.get();
    }
}
