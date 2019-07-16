package lesson9;

public class ExceptionExample {
    public static void main(String[] args) {
        procA();
    }

    public static void makeSomeMagic() {
        int a = 999999999;
        try {
            System.out.println(a/0);
        } catch (ArithmeticException e) {
            System.out.println("EXCEPTION!!! / 0");
            System.out.println(a/1);
        }

    }

    private static void procA() {
        try {
            System.out.println("inside procA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("procA's finally");
        }
    }

    public static String getSurname(String nameAndSurname){
        String surname = nameAndSurname.split(" ")[1];
        try {
            return surname;
        } finally {
            System.out.println(surname);
        }
    }


}

