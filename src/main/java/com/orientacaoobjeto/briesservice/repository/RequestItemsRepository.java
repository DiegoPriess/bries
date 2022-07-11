package com.orientacaoobjeto.briesservice.repository;

import com.orientacaoobjeto.briesservice.models.Item;
import com.orientacaoobjeto.briesservice.models.RequestItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequestItemsRepository extends JpaRepository<RequestItems, Long> {
    List<RequestItems> findByRequestId(Long requestId);
}