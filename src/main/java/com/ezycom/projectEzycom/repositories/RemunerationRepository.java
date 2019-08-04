package com.ezycom.projectEzycom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ezycom.projectEzycom.entities.Remuneration;

@Repository
public interface RemunerationRepository extends JpaRepository<Remuneration, Long> {
}