import java.util.Scanner;

public class ConsoleChar {

    public static void main(String[] args) throws InterruptedException {

        Scanner in = new Scanner(System.in);
        System.out.print("Write any symbol and press Enter: ");
        char symbol = in.next().charAt(0);
        in.close();
        int symbolInt = (int) symbol;
        System.out.println("The symbol '" + symbol + "' was converted to an integer value: " + symbolInt);

    }
}
