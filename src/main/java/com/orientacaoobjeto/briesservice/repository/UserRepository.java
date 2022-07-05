package com.orientacaoobjeto.briesservice.repository;

import com.orientacaoobjeto.briesservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}