package problem_set;

public class NumberUtils {
    public int getLastDigit(int number) {
        if (number < 0) return -1;
        return number % 10;
    }

    public int getNumberOfDigits(int number) {
        int numOfDigits = 0;
        if (number < 0) return -1;
        if (number == 0) return 1;

        while (number > 0) {
            number /= 10;
            numOfDigits++;
        }

        return numOfDigits;
    }

    public int getSumOfDigits(int number) {
        if (number < 0) return -1;
        if (number == 0) return 0;

        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    public int reverseNumber(int number) {
        if (number == 0 ) return 0;
        if (number < 0) return -1;

        int num = 0;

        while (number > 0) {
            int remainder = number % 10;
            num = num * 10 + remainder;
            number /= 10;
        }

        return num;

    }
}
