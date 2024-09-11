package com.VijaOl.onlineStoreDemoSpring.Controler;

import com.VijaOl.onlineStoreDemoSpring.Service.StoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/order")
public class StoreControler {
    private final StoreService storeService;

    public StoreControler(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping(path = "/add")
    public void add(@RequestParam List<Integer> ids) {
        storeService.addBasket(ids);
    }

    @GetMapping(path = "/get")
    public List<Integer> get() {
        return storeService.getBasket();
    }
}
