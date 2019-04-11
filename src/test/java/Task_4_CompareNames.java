import java.util.Scanner;

public class Task_4_CompareNames {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two names. Press enter after each name: ");
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();

        if (name1.equals(name2)) {
            System.out.println("The names are the same");
        } else {
            System.out.println("These names are different");

        }
    }
}
