package com.orientacaoobjeto.briesservice.repository;

import com.orientacaoobjeto.briesservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByCpfAndPassword(@NotNull final Long cpf, @NotNull final String password);
}