package oop.level2.abstraction;

public class Aeroplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("With Fuel");
    }
}
