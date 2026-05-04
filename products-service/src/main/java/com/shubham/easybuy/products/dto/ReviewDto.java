package com.shubham.easybuy.products.dto;

import com.shubham.easybuy.products.entity.Product;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReviewDto {
    private Long id;
    private String title;
    private String comment;
    private Integer rating;
    private Product product;
}
