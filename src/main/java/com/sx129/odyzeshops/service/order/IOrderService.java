package com.sx129.odyzeshops.service.order;

import com.sx129.odyzeshops.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    Order getOrder(Long orderId);

    List<Order> getUserOrders(Long userId);
}
