package apicontroledeacesso.service;

// Importa a SUA entidade User
import apicontroledeacesso.entity.User;

// Importa o repositório
import apicontroledeacesso.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    // Cria usuário ADMIN
    public User createAdmin() {
        User user = new User();
        user.setUsername("admin");
        user.setRoles(Set.of("ADMIN"));
        return repository.save(user);
    }

    // Cria usuário MANAGER
    public User createManager() {
        User user = new User();
        user.setUsername("manager");
        user.setRoles(Set.of("MANAGER"));
        return repository.save(user);
    }

    // Cria usuário USER
    public User createUser() {
        User user = new User();
        user.setUsername("user");
        user.setRoles(Set.of("USER"));
        return repository.save(user);
    }
}
