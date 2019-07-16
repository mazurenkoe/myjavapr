public class Task_4_Snake_Case {

    public static void main(String[] args) {

        String camelStr = new String("iLoveJustinBieber");
        String snakelStr = camelStr.replaceAll("(.)([A-Z])", "$1_$2");
        System.out.println(snakelStr);
    }
}
