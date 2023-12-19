package com.picpaysimplificado.repositories;

import com.picpaysimplificado.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    //opcional é pq pode n ter sido cadastrado com cpf
    Optional<User> findUserByDocument(String document);

    Optional<User> findUserByDocument(Long id);
}
