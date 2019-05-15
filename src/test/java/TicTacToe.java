import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private static Scanner input = new Scanner(System.in);
    private static char[][] map = new char[3][3];
    private static Random rand = new Random();

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        createMap();
        System.out.println("Write the nuber of gave you would like to start:");
        System.out.println("1 - Human & Computer");
        System.out.println("2 - Human & Human");
        System.out.println("3 - Computer & Computer");
        int gametype = input.nextInt();

        switch (gametype) {
            case 1:
                mode(1);
                break;
            case 2:
                mode(2);
                break;
            case 3:
                mode(3);
                break;
            default:
                System.out.println("There are only 3 games available");
                break;
        }
    }

    /**
     *
     * @param mode
     */
    private static void mode(int mode) {
        printMap();

        while (true) {
            char player1 = 'X';
            if (mode == 1 || mode == 2) {
                humanStep(player1);
            } else {
                computerStep(player1);
            }
            System.out.println("\"" + player1 + "\" Player step:");

            printMap();

            if (checkWin(player1)) {
                System.out.println("\"" + player1 + "\" Player won!");
                break;
            }
            if (isMapFull()) break;

            char player2 = 'O';
            if (mode == 1 || mode == 3) {
                computerStep(player2);
            } else {
                humanStep(player2);
            }
            System.out.println("\"" + player2 + "\" Player step:");

            printMap();
            if (checkWin(player2)) {
                System.out.println("\"" + player2 + "\" Player won!");
                break;
            }
            if (isMapFull())
                break;
        }
    }

    /**
     *
     */
    private static void createMap() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                map[i][j] = '*';
            }
        }
    }

    /**
     *
     */
    private static void printMap() {
        char arrowright = 0x2192;
        char arrowdown = 0x2193;

        System.out.println("x" + arrowright + "   y" + arrowdown);
        System.out.println("0 1 2 3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     *
     * @param playerSign
     */
    private static void humanStep(char playerSign) {
        int x, y;
        do {
            System.out.println("To make step, enter x, y coordinates separated by space and press Enter:");
            x = input.nextInt() - 1;
            y = input.nextInt() - 1;
        } while (!isCellEmpty(x, y));
        map[y][x] = playerSign;
    }

    /**
     *
     * @param playerSign
     */
    private static void computerStep(char playerSign) {
        int x, y;
        do {
            x = rand.nextInt(3);
            y = rand.nextInt(3);
        } while (!isCellEmpty(x, y));
        map[y][x] = playerSign;
    }

    /**
     *
     * @param x
     * @param y
     * @return
     */
    private static boolean isCellEmpty(int x, int y) {
        if ((x < 0 || x > 2 || y < 0 || y > 2)) return false;
        if (map[y][x] != '*') return false;
        return true;
    }

    /**
     *
     * @return
     */
    private static boolean isMapFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j] == '*')
                    return false;
            }
        }
        return true;
    }

    /**
     *
     * @param xORo
     * @return
     */
    private static boolean checkWin(char xORo) {
        if (map[0][0] == xORo && map[0][1] == xORo && map[0][2] == xORo) return true;
        if (map[1][0] == xORo && map[1][1] == xORo && map[1][2] == xORo) return true;
        if (map[2][0] == xORo && map[2][1] == xORo && map[2][2] == xORo) return true;

        if (map[0][0] == xORo && map[1][0] == xORo && map[2][0] == xORo) return true;
        if (map[0][1] == xORo && map[1][1] == xORo && map[2][1] == xORo) return true;
        if (map[0][2] == xORo && map[1][2] == xORo && map[2][2] == xORo) return true;

        if (map[0][0] == xORo && map[1][1] == xORo && map[2][2] == xORo) return true;
        if (map[2][0] == xORo && map[1][1] == xORo && map[0][2] == xORo) return true;

        return false;
    }
}
