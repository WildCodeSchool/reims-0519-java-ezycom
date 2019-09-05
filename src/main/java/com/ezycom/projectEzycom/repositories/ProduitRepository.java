package com.ezycom.projectEzycom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ezycom.projectEzycom.entities.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long>{
    
}