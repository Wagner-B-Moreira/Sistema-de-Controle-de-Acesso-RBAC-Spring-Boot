package apicontroledeacesso.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.*;
import java.util.Set;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")

public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.UUID)
        private String id;

        private String username;

        // Roles do usuário
        @ElementCollection(fetch = FetchType.EAGER)
        private Set<String> roles;

}
