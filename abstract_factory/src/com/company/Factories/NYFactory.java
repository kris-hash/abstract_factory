package com.company.Factories;
import com.company.Ingredients.cheese.*;
import com.company.Ingredients.dough.*;
import com.company.Ingredients.sauce.*;

public class NYFactory implements PizzaFactory{
    @Override
    public String getFactoryName() {
        return "New-York";
    }

    @Override
    public Cheese createCheese() {
        return new NYCheese();
    }

    @Override
    public Dough createDough() {
        return new ThinDough();
    }

    @Override
    public Sauce createSauce() {
        return new ExtraSauce();
    }
}
