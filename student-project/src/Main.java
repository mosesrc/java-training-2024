import java.math.BigDecimal;

;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] marks = {99, 98, 100};

        Student student = new Student("Ryan", 97, 98, 100);
        Student student1 = new Student("Adam", 97, 98);
        Student student2 = new Student("Eve", 97, 98, 90, 98);


        int number = student.getNumberOfMarks();
        System.out.println("Number of marks: " + number);

        int sum = student.getTotalSumOfMarks();
        System.out.println("sum of marks: " + sum);

        int maximumMark = student.getMaximumMark();
        System.out.println("maximum of marks: " + maximumMark);

        int minimumMark = student.getMinimumMark();
        System.out.println("minimum of marks: " + minimumMark);

        BigDecimal average = student.getAverageMarks();
        System.out.println("average of marks: " + average);

        student.addNewMark(35);

        student.removeMarkAtIndex(1);

        String maxWord = student.maxWordCount();;
        System.out.println("\nDay of the week with the most characters: " + maxWord);
        student2.reverseDays();

        System.out.println(student);
        System.out.println(student1);
        System.out.println(student2);
    }
}
