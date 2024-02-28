import java.util.Scanner;
import java.util.Arrays;
public class ascending_order {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers do you want to input: ");
        int amount = in.nextInt();
        int[] numbers = new int[amount];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Input Number " + i + ": ");
            numbers[i] = in.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println("Sorted: " + Arrays.toString(numbers));
    }
}
