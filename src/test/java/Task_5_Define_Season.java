import java.util.Scanner;

public class Task_5_Define_Season {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert the number of any month and press enter: ");
        int monthnumber = in.nextInt();
        String season;
        switch (monthnumber) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "There are only 12 months exists. Please, enter valid number of month.";
                break;
        }
        if (monthnumber > 0 && monthnumber < 13) {
            System.out.print("This month relates to " + season + " season.");
        } else {
            System.out.print(season);
        }
    }
}
