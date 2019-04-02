public class Math3_Rounding {

//    В переменной n хранится вещественное число с ненулевой дробной частью.
//    Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.

    public static void main(String[] args) {

        float num = 3.49f;
        int intPart = (int) num;
        float fractPart = num - (int) num;

        if (fractPart >= 0.5) {
            System.out.println(intPart + 1);
        } else
            System.out.println(intPart);
    }
}
