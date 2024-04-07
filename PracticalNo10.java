import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PracticalNo10
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter 5 integers:");

        // Read 5 integers from the user
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            int num = scanner.nextInt();
            numbers.add(num);
        }

        // Calculate sum using streams and lambda expression
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Sum of numbers: " + sum);
    }
}