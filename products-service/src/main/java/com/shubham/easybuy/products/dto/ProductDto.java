package com.shubham.easybuy.products.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private UUID id;
    private String title;
    private String shortDesc;
    private String longDesc;
    private Double price;
    private Integer discount;
    private Boolean live = false;
    private List<String> productImages = new ArrayList<>();
    private List<CategoryDto> categories = new ArrayList<>();
    private List<ReviewDto> reviews = new ArrayList<>();
}
