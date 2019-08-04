package com.ezycom.projectEzycom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ezycom.projectEzycom.entities.Commercial;

@Repository
public interface CommercialRepository extends JpaRepository<Commercial, Long> {
}