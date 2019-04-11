import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

//Даны 4 числа типа int. Сравнить их и вывести наименьшее на консоль.

/**
 *
 */
public class Task1_MinimalNumber {

    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert four integers separating each integer by space: ");

        int arr[] = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        selectionSort(arr);
        System.out.print(arr[0]);
    }

    /**
     * @param arr
     */
    static void selectionSort(@NotNull int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    }
}
