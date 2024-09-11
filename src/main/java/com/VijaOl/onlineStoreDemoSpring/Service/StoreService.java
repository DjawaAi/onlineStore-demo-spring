package com.VijaOl.onlineStoreDemoSpring.Service;

import com.VijaOl.onlineStoreDemoSpring.Basket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

    public Basket basket;

    public StoreService(Basket basket) {
        this.basket = basket;
    }

    public void addBasket(List<Integer> ids) {
        basket.addPositions(ids);
    }

    public List<Integer> getBasket() {
        return basket.getPositions();
    }
}
