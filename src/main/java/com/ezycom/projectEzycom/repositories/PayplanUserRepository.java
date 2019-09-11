package com.ezycom.projectEzycom.repositories;

import com.ezycom.projectEzycom.entities.PayplanUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayplanUserRepository extends JpaRepository<PayplanUser, Long> {
}