package com.yesko.cartmanagementservice.endpoint;

import com.yesko.cartmanagementservice.client.ProductClient;
import com.yesko.cartmanagementservice.dto.ProductDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/open-api")
public class HelloResource {
    @Autowired
    private ProductClient productClient;

    @GetMapping("/products")
    public List<ProductDTO> product() {
        return productClient.products();
    }
}
