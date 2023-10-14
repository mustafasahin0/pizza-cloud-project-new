package com.cydeo.pizzacloud.repository;

import com.cydeo.pizzacloud.model.Pizza;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Configuration
public class PizzaRepository {

    private static List<Pizza> pizzaList = new ArrayList<>();

    public Pizza createPizza(Pizza pizzaToSave) {
        pizzaList.add(pizzaToSave);
        return pizzaToSave;
    }

    public List<Pizza> readAll() {
        return pizzaList;
    }

    public Pizza getPizza(UUID pizzaId) {
        return pizzaList.stream().filter(p -> p.getId().equals(pizzaId)).findFirst().orElse(null);
    }

}
