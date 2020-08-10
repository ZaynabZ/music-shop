package com.project.musicstore.service;

import com.project.musicstore.entity.Cart;

public interface CarteService {
	
	Cart getCartById (int cartId);

    void update(Cart cart);

}
