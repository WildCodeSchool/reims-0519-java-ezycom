package com.ezycom.projectEzycom.repositories;

import java.util.List;
import com.ezycom.projectEzycom.entities.Commission;
import com.ezycom.projectEzycom.entities.Sale;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository

public interface SaleRepository extends JpaRepository<Sale, Long>{

    @Query(
        value = "select commercial,month,sum(marge * percent/100) as commission from ezycom.sale where commercial=:commercial AND month=:month group by commercial, month",
        nativeQuery = true
    )
    List<Commission> findCommissionsGroupByCommercial(@Param("month") String month, @Param("commercial") String commercial);

    @Query(
        value = "select *, (marge*percent/100) as commission from ezycom.sale where commercial=:commercial AND month=:month",
        nativeQuery = true
    )
    List<Sale> findAllSalesByCommercialAndByMonth(@Param("month") String month, @Param("commercial") String commercial);

    @Query(
        value = "SELECT * FROM ezycom.sale where commercial=:commercial",
        nativeQuery = true
    )
    List<Sale> findAllSalesByCommercial(String commercial);
}