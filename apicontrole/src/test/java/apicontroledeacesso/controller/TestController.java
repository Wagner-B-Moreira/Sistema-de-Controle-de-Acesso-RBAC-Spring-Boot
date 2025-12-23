package apicontroledeacesso.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    // Endpoint publico
    @GetMapping("/public")
    public String publicEndpoint() {
        return "Acesso public";
    }

    // qualquer usuario autenticado
    @GetMapping("/user")
    public  String userEndopint() {
        return  "usuario autenticado";
    }
    // Apenas ADMIN
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/admin")
    public String adminEndpoint() {
        return "Acesso ADMIN";
    }

    // ADMIN ou MANAGER
    @PreAuthorize("hasAnyRole('ADMIN','MANAGER')")
    @PostMapping("/manager")
    public String managerEndpoint() {
        return "Acesso MANAGER ou ADMIN";
    }
}
