package com.ezycom.projectEzycom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ezycom.projectEzycom.entities.Vendre;

@Repository
public interface VendreRepository extends JpaRepository<Vendre, Long> {
}