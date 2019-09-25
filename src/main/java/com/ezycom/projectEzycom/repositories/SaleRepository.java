package com.ezycom.projectEzycom.repositories;

import com.ezycom.projectEzycom.entities.Sale;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long>{
    
}