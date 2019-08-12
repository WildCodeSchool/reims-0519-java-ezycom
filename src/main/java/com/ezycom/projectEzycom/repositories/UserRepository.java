package com.ezycom.projectEzycom.repositories;

import com.ezycom.projectEzycom.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}