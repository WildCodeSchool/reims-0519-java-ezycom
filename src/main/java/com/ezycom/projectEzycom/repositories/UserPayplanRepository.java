package com.ezycom.projectEzycom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ezycom.projectEzycom.entities.UserPayplan;

@Repository
public interface UserPayplanRepository extends JpaRepository<UserPayplan, Long> {
}