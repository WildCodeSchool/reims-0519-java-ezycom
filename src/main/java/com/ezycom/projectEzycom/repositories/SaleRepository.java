package com.ezycom.projectEzycom.repositories;

import java.util.List;
import com.ezycom.projectEzycom.entities.Commission;
import com.ezycom.projectEzycom.entities.Sale;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository

public interface SaleRepository extends JpaRepository<Sale, Long>{

    @Query(
        value = "select commercial,sum(marge * percent/100) as commission from ezycom.sale group by commercial",
        nativeQuery = true
    )
    List<Commission> findByCommercial();
}