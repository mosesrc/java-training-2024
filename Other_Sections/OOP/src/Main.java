import oop.level2.Rectangle;
import oop.level2.abstraction.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//      Rectangle rectangle = new Rectangle(23, 123);
        Recipe recipe1 = new Recipe();
        recipe1.execute();

        System.out.println();

        Flyable[] flyingObjects = {new Bird(), new Aeroplane()};
        Animal[] animals = {new Cat(), new Dog()};

        for (int i = 0; i < flyingObjects.length; i++) {
            flyingObjects[i].fly();
        }

        for (int i = 0; i < animals.length; i++) {
            animals[i].bark();
        }
    }
}