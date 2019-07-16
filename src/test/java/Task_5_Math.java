import java.util.Scanner;

public class Task_5_Math {
    public static void main(String[] args) {
        int a, b, answer;
        answer = 1;
        a = 5;
        b = 10;
        int[] arr;

        while (answer > 0) {

            System.out.println("-----------------------------------------------------------------------");
            System.out.println("There are two variables \"a\" and \"b\", what do you want to do with them?");
            System.out.println("\n 1 - Show variables");
            System.out.println("\n 2 - Show variable with max value");
            System.out.println("\n 3 - Sum variables");
            System.out.println("\n 4 - Update variables");
            System.out.println("\n 5 - Nothing!");


            Scanner in = new Scanner(System.in);
            answer = in.nextInt();


            switch (answer) {

                case 1:
                    showVars(a, b);
                    break;
                case 2:
                    findMax(a, b);
                    break;
                case 3:
                    sumVariables(a, b);
                    break;
                case 4:
                    arr = updateVariables(a, b);
                    a = arr[0];
                    b = arr[1];
                    break;
                case 5:
                    answer = 0;
                    System.out.println("Good bye =(");

                    break;
                default:
                    System.out.println("Unexpected answer");

                    break;
            }
        }
    }

    private static void showVars(int a, int b) {
        System.out.println("a = " + a + "; b = " + b);
    }

    private static void findMax(int a, int b) {
        if (a > b)
            System.out.println("Variable with max value is " + a);
        else
            System.out.println("Variable with max value is " + b);
    }

    private static void sumVariables(int a, int b) {
        int sumVar = a + b;
        System.out.println("Sum of variables is " + sumVar);
    }

    private static int[] updateVariables(int a, int b) {

        Scanner in = new Scanner(System.in);

        System.out.println("Set value of \"a\" variable and press enter");
        a = in.nextInt();

        System.out.println("Set value of \"b\" variable and press enter");
        b = in.nextInt();

        System.out.println("a = " + a + "; b = " + b);

        int[] arr = new int[2];
        arr[0] = a;
        arr[1] = b;
        return arr;

    }
}
