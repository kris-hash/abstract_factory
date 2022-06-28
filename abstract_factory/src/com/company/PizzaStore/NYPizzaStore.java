package com.company.PizzaStore;
import com.company.Pizza.*;
import com.company.Factories.*;
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaFactory ingredientFactory = new NYFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
        }

        return pizza;
    }
}
