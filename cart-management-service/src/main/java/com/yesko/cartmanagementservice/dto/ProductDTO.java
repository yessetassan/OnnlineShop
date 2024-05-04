package com.yesko.cartmanagementservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private Long id;
    private String name;
    private String description;
    private String SKU;
    private BigDecimal price;
    private DiscountDTO discountDTO;
    private Integer quantity;
    private String category;
}
