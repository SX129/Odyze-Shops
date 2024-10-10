package com.sx129.odyzeshops.service.cart;

import com.sx129.odyzeshops.model.Cart;
import com.sx129.odyzeshops.model.User;

import java.math.BigDecimal;

public interface ICartService {
    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);

    Cart initializeNewCart(User user);

    Cart getCartByUserId(Long userId);
}
