package com.shubham.easybuy.products.repository;

import com.shubham.easybuy.products.entity.Product;
import com.shubham.easybuy.products.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepo extends JpaRepository<Review,Long> {
    List<Review> findByProduct(Product product);
}
