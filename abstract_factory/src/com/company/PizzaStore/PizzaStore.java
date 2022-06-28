package com.company.PizzaStore;
import com.company.Pizza.*;
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        System.out.println("Your order:");

        pizza.getDescription();
        pizza.preparing();
        pizza.bake();
        pizza.cut();
        pizza.box();
        pizza.returnName();

        System.out.println("ready");
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
