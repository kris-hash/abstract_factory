package com.company.Factories;
import com.company.Ingredients.cheese.*;
import com.company.Ingredients.dough.*;
import com.company.Ingredients.sauce.*;

public interface PizzaFactory {
    String getFactoryName();
    Cheese createCheese();
    Dough createDough();
    Sauce createSauce();

}
