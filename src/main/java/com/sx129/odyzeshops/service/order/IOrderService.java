package com.sx129.odyzeshops.service.order;

import com.sx129.odyzeshops.model.Order;

public interface IOrderService {
    Order placeOrder(Long userId);
    Order getOrder(Long orderId);
}
