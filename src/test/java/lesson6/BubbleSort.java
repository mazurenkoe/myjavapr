package lesson6;

public class BubbleSort {
    public static void main(String[] args) throws InterruptedException {

        int ar[] = {8, 3, 15, 4, 2};

        for (int i = 0; i < ar.length - 1; i++) {
            int x = ar[i];
            int y = ar[i + 1];
            if (x > y) {
                ar[i + 1] = x;
                ar[i] = y;
            }
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
