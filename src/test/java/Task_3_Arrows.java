public class Task_3_Arrows {

    public static void main(String[] args) {

        String originalStr = new String("Это ##тестовый пример## для задачи ##на## строки ##тест");
        String closeArrowStr = new String();


        while (originalStr.contains("##")) {
            String openArrowStr = originalStr.replaceFirst("##", "<");
            closeArrowStr = openArrowStr.replaceFirst("##", ">");
            originalStr = closeArrowStr;

        }
        System.out.println(closeArrowStr);

    }
}