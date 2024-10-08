package com.sx129.odyzeshops.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemDto {
    private Long productId;
    private String productName;
    private BigDecimal price;
    private int quantity;
}
