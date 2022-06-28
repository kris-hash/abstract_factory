package com.company.Pizza;
import com.company.Factories.*;
public class CheesePizza extends Pizza {
    private PizzaFactory ingredientFactory;
    public CheesePizza(PizzaFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.name = "Cheese Pizza from " + ingredientFactory.getFactoryName() + ";";
    }

    @Override
    public void prepare() {
        this.cheese = ingredientFactory.createCheese();
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
    }
}
