import java.util.Random;
        import java.util.Scanner;

public class Tic_tac_toe {
    private static Scanner input = new Scanner(System.in);
    private static char[][] field = new char[3][3];
    private static Random rand = new Random();
    private static final int CONSTANT_ONE = 1;

    public static void main(String[] args) {
        createMap(field);
        printMap(field);

    }

    private static void createMap(char[][] field) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = '*';
            }
        }
    }

    private static void printMap(char[][] field) {
        System.out.println("0 1 2 3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void humanStep() {
        int x, y;
        System.out.println("To make step, enter x, y coordinates:");
        x = input.nextInt() - 1;
    }
}



