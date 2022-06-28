package com.company.Factories;
import com.company.Ingredients.cheese.*;
import com.company.Ingredients.dough.*;
import com.company.Ingredients.sauce.*;

public class ChicagoFactory implements PizzaFactory {
    @Override
    public String getFactoryName() {

        return "Chicago";
    }

    @Override
    public Cheese createCheese() {
        return new ChicagoCheese();
    }

    @Override
    public Dough createDough() {

        return new ThickDough();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }
}
