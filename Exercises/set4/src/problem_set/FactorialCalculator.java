package problem_set;

public class FactorialCalculator {
    public int calculateFactorial(int number) {
        if (number < 0) return -1;
        int sum = 1;
        for (int i = 1; i <= number; i++) {
            sum *= i;
        }
        return sum;
    }
}
