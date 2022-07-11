package com.orientacaoobjeto.briesservice.repository;

import com.orientacaoobjeto.briesservice.models.Request;
import com.orientacaoobjeto.briesservice.models.RequestItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestItemsRepository extends JpaRepository<RequestItems, Long> {
}