package com.yesko.cartmanagementservice.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentProcessDTO {
    private Long productId;
    private Integer quantity;
}
