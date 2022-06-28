package com.company.Pizza;
import com.company.Factories.*;
public class PepperoniPizza extends Pizza {
    private PizzaFactory ingredientFactory;

    public PepperoniPizza(PizzaFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.name = "Pepperoni Pizza from " + ingredientFactory.getFactoryName() + ";";
    }

    @Override
    public void prepare() {
        this.cheese = ingredientFactory.createCheese();
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
    }
}
