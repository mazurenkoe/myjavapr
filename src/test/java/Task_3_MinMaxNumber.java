import java.util.Scanner;

public class Task_3_MinMaxNumber {
    public static void main(String[] args) {

        int arr[] = Task1_2_MinimalNumber_MaxCount.inputArray(5);

        int x = arr[0];
        int y = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= x) {
                x = arr[i];
            }
            if (arr[i] <= y)
                y = arr[i];
        }

        System.out.println("Max number is: " + x + "\n Min number is: " + y);
    }
}
