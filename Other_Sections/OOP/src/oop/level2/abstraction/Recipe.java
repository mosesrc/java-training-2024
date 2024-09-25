package oop.level2.abstraction;

public class Recipe extends AbstractRecipe {

    @Override
    void getReady() {
        System.out.println("Get the raw materials");
        System.out.println("Get the utensils");
    }

    @Override
    void doTheDish() {
        System.out.println("Prepare the dish");
    }

    @Override
    void cleanup() {
        System.out.println("Cleanup the Utensils");
    }
}
