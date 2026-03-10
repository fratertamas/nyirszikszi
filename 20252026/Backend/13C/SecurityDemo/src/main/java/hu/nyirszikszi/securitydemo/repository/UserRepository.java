package hu.nyirszikszi.securitydemo.repository;


import hu.nyirszikszi.securitydemo.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<AppUser, Long> {
    Optional<AppUser> findByUsername(String username);
}
