import java.util.List;
import java.util.stream.IntStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Banana", "Bat", "Cat", "Dog");
        printWithFP(list);
        System.out.println();
        printWithFiltering(list);

        List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);
        numbers.stream()
                .forEach(element -> System.out.println(element));

        int sum = normalSum(numbers);
        System.out.println(sum);
        System.out.println();

        IntStream.range(1, 10).forEach(num -> System.out.println(num * num));
        List.of("Apple", "Ant", "Bat").stream().forEach(word -> System.out.println(word.toLowerCase()));
        List.of("Apple", "Ant", "Bat").stream().forEach(word -> System.out.println(word.length()));

        System.out.println();
        System.out.println("Functional Programming");
        List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
                .map(s -> s.length())
                .forEach(s -> System.out.println(s));

        List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
                .map(s -> s.length())
                .forEach(Main::print);

    }

    public static void print(Integer num) {
        System.out.println(num);
    }

    private static void printBasic(List<String> list) {
        for (String str : list) {
            System.out.println(str);
        }
    }

    private static void printWithFP(List<String> list) {
        list.stream().forEach(element -> System.out.println(element));
    }

    private static void printWithFiltering(List<String> list) {
        list.stream()
                .filter(element -> element.endsWith("at"))
                .forEach(element -> System.out.println(element));
    }

    private static int normalSum(List<Integer> numbers) {
        int sum = numbers.stream()
                .reduce(0, (num1, num2) -> num1 + num2);
        return sum;
    }
}