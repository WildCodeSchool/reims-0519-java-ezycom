package com.ezycom.projectEzycom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ezycom.projectEzycom.entities.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
}