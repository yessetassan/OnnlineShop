package com.yesko.cartmanagementservice.client;


import com.yesko.cartmanagementservice.dto.ProductDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface ProductClient {
    @GetExchange("/open-api/product")
    public List<ProductDTO> products();
}
