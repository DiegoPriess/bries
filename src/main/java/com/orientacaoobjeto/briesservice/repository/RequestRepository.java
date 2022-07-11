package com.orientacaoobjeto.briesservice.repository;

import com.orientacaoobjeto.briesservice.models.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {
}