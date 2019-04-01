import java.util.Scanner;

public class ConsoleCharInt {

    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        charToInt(in);
        intToChar(in);
        in.close();
    }

    /**
     * @param in
     */
    private static void intToChar(Scanner in) {
        System.out.print("Write any number and press Enter: ");
        int num = in.nextInt();
        char numChar = (char) num;
        System.out.println("The number '" + num + "' was converted to character: " + numChar);
    }

    /**
     * @param in
     */
    private static void charToInt(Scanner in) {
        System.out.print("Write any symbol and press Enter: ");
        char symbol = in.next().charAt(0);
        int symbolInt = (int) symbol;
        System.out.println("The element '" + symbol + "' was converted to: " + symbolInt);
    }
}
