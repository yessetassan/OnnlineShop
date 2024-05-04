package com.yesko.cartmanagementservice.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CartItemDTO {
    private String productName;
    private Integer quantity;
}
