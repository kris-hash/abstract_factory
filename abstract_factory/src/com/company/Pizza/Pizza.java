package com.company.Pizza;
import com.company.Ingredients.cheese.*;
import com.company.Ingredients.dough.*;
import com.company.Ingredients.sauce.*;

public abstract class Pizza {
    String name;
    Cheese cheese;
    Dough dough;
    Sauce sauce;

    public abstract void prepare();

    public void getDescription() {
        System.out.println(this.name);
        System.out.println("Ingredients:");

        System.out.println("Cheese - " + this.cheese.getDescription());

        System.out.println("Dough - " + this.dough.getDescription());

        System.out.println("Sauce - " + this.sauce.getDescription());
    }

    public void preparing() {
        System.out.println("preparing..");
    }
    public void bake() {
        System.out.println("baking..");
    }

    public void cut() {
        System.out.println("cuting..");
    }

    public void box() {
        System.out.println("wrapping..");
    }
    public String returnName() {
        return name;
    }
}
