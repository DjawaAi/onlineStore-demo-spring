package com.VijaOl.onlineStoreDemoSpring;

import org.apache.catalina.util.Introspection;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Component
@SessionScope
public class Basket {
    private final List<Integer> positions = new ArrayList<>();

    public void addPositions(List<Integer> ids) {
        positions.addAll(ids);
    }

    public List<Integer> getPositions() {
        return positions;
    }
}
