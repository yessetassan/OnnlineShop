package com.yesko.cartmanagementservice.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class PaymentProcessStatusDTO {
    private String status;
}
