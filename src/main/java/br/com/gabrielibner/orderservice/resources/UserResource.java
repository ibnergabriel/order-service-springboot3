package br.com.gabrielibner.orderservice.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gabrielibner.orderservice.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(
            "Gabriel", "ibner@gmail.com", "21999261398", "1234");
        return ResponseEntity.ok().body(user); 
    
    }
}
