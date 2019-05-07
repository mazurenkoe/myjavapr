import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Count_character_in_string {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write any string and press enter.");
        String inputStr = scanner.nextLine();
        System.out.println("Write the character you would like to count in given string and press enter:");
        char inputChar = scanner.next(".").charAt(0);
        String inputLetter = Character.toString(inputChar);

        int lengthStr = inputStr.length();
        String withoutA = inputStr.replaceAll(inputLetter, "");
        int lengthStrwithoutA = withoutA.length();
        int countA = lengthStr - lengthStrwithoutA;

        List indexes = new ArrayList();

        for (int i = 0; i < lengthStr; i++) {

            if (inputStr.charAt(i) == inputChar)
                indexes.add(i);
        }

        System.out.println("Character " + inputLetter + " is presented in given string "
                + countA + " time(s) on position(s) " + indexes);
    }
}
