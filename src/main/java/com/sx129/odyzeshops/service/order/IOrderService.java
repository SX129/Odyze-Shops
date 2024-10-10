package com.sx129.odyzeshops.service.order;

import com.sx129.odyzeshops.dto.OrderDto;
import com.sx129.odyzeshops.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);

    List<OrderDto> getUserOrders(Long userId);

    OrderDto convertToDto(Order order);
}
