package com.shubham.easybuy.products.repository;

import com.shubham.easybuy.products.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoryRepo extends JpaRepository<Category,Long> {

    @Query("SELECT c FROM Category c JOIN c.products p WHERE p.id = :productId")
    List<Category> findByProductId(@Param("productId") String productId);
}
