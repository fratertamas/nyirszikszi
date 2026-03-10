package hu.nyirszikszi.securitydemo.config;

import hu.nyirszikszi.securitydemo.domain.AppUser;
import hu.nyirszikszi.securitydemo.entity.Role;
import hu.nyirszikszi.securitydemo.repository.RoleRepository;
import hu.nyirszikszi.securitydemo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DataSeeder {

    @Bean
    CommandLineRunner seed(RoleRepository roleRepository, UserRepository userRepository, PasswordEncoder encoder) {
        return args -> {
            Role userRole = roleRepository.findByName("ROLE_USER").orElseGet(() -> roleRepository.save(new Role("ROLE_USER")));
            Role adminRole = roleRepository.findByName("ROLE_ADMIN").orElseGet(() -> roleRepository.save(new Role("ROLE_ADMIN")));

            if (userRepository.findByUsername("user").isEmpty()) {
                AppUser u = new AppUser("user", encoder.encode("user123"));
                u.addRole(userRole);
                userRepository.save(u);
            }

            if (userRepository.findByUsername("admin").isEmpty()) {
                AppUser a = new AppUser("admin", encoder.encode("admin123"));
                a.addRole(adminRole);
                userRepository.save(a);
            }
        };
    }
}
