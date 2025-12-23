package apicontroledeacesso.repository;

import apicontroledeacesso.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
