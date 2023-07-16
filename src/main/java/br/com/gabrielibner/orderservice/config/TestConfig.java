package br.com.gabrielibner.orderservice.config;

import br.com.gabrielibner.orderservice.entities.User;
import br.com.gabrielibner.orderservice.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    private final UserRepository userRepository;
    // Injeção de Depedências recomendado (ESQUECER @Autowired)
    public TestConfig(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User("Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User("Alex Green", "alex@gmail.com", "977777777", "123456");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
