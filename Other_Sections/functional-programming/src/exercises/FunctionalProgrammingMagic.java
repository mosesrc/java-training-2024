package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.stream;

public class FunctionalProgrammingMagic {
    public static List<Integer> filterOddNumbers(List<Integer> numbers) {
        return numbers.stream().filter(n -> n % 2 == 1 || n % 2 == -1).collect(Collectors.toList());
    }

    public static List<Integer> getCubesOfFirstNNumbers(int n) {
        IntStream cubes = IntStream.range(1, n);
        return cubes.map(num -> num * num * num).boxed().collect(Collectors.toList());
    }

    public static List<Integer> getCourseNameCharacterCount(List<String> courses) {
        if (courses == null || courses.isEmpty()) return List.of();
        return courses.stream().map(String::length).collect(Collectors.toList());
    }

    public static long sumOfSquares(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) return 0;
        return numbers.stream().map(num -> num * num).reduce(0, Integer::sum);
    }

    public static int findMaxEvenNumber(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) return 0;
        Optional<Integer> maxEven = numbers.stream().filter(n -> n % 2 ==0).max(Integer::compare);
        return maxEven.orElse(0);
    }
}
