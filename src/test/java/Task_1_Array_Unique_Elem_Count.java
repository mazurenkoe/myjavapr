import java.util.Scanner;

public class Task_1_Array_Unique_Elem_Count {

    public static void main(String[] args) {

        int arr[] = inputArray(10);

        System.out.println("Amount of unique elements is: " + uniqueCount(arr));
    }

    protected static int[] inputArray(int length) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert " + length + " integer(s) separating each integer by space and press enter: ");

        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }

    public static int uniqueCount(int[] array) {

        int[] copy = new int[array.length];
        int res = 0;
        int countNum = 0;
        int count = 0;

        for (int i = 0; i < copy.length; i++) {
            copy[i] = 0;
        }

        for (int i = 0; i < array.length; i++) {
            if (copy[i] == 0) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        copy[j] = 1;
                        count++;
                    }
                }
            }
            if (countNum < count) {
                countNum = count;
                res++;
            }
        }
        return res;

    }
}
