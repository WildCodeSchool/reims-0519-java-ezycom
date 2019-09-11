package com.ezycom.projectEzycom.repositories;

import com.ezycom.projectEzycom.entities.Sales;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesRepository extends JpaRepository<Sales, Long>{
}