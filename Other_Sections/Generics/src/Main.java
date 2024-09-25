import generics.MyCustomList;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static <X extends List> void duplicate(X list) {
        list.addAll(list);
    }

    static double sumOfNumberList(List<? extends Number> numbers) {
        double sum = 0.0;

        for(Number number: numbers) {
            sum += number.doubleValue();
        }

        return sum;
    }


    public static void main(String[] args) {
        MyCustomList<String> list = new MyCustomList<>();
        list.addElement("Element 1");
        list.addElement("Element 2");
        String value = list.get(0);
        System.out.println(value);
        System.out.println(list);

        MyCustomList<Integer> list2 = new MyCustomList<>();
        list2.addElement(5);
        list2.addElement(5);
        Integer value2 = list2.get(0);
        System.out.println(value2);
        System.out.println(list2);


        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);
        duplicate(numbers);
        System.out.println(numbers);

        System.out.println(sumOfNumberList(numbers));
    }
}