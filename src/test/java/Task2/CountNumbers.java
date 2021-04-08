package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountNumbers {

    File file = new File("src/test/java/Task2/number.txt");

    public Double getNumbersCountInFile() throws FileNotFoundException {
        Scanner scan = new Scanner(file);
        scan.hasNextInt();

        Double count = 0.0;
        while (scan.hasNextLine()) {
            String currentLine = scan.nextLine();
            if (!currentLine.startsWith("#") && currentLine.length() > 0)
                count += Double.parseDouble(currentLine);
        }
        return count;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("***");
        System.out.println("The count of number in file is " + new CountNumbers().getNumbersCountInFile());
        System.out.println("***");
    }
}
