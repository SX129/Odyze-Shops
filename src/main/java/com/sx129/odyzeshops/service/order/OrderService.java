package com.sx129.odyzeshops.service.order;

import com.sx129.odyzeshops.model.Order;
import com.sx129.odyzeshops.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService implements IOrderService {
    private final OrderRepository orderRepository;

    @Override
    public Order placeOrder(Long userId) {
        return null;
    }

    @Override
    public Order getOrder(Long orderId) {
        return null;
    }
}
