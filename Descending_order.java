import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Descending_order{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Input Number " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Numbers in descending order: " + Arrays.toString(arr));
    }
}
