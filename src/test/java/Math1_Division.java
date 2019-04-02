public class Math1_Division {

//    В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую на экран
//    результат деления q на w с остатком. Пример вывода программы (для случая, когда в q хранится 21,
//    а в w хранится 8): 21 / 8 = 2 и 5 в остатке

    public static void main(String[] args) {

        int q = 18;
        int w = 6;
        int fractPart;
        fractPart = q % w;
        int intPart = (q / w);
        if (fractPart == 0) {
            System.out.println(q + "/" + w + " = " + intPart + " и 0 в остатке");
        } else
            System.out.println(q + "/" + w + " = " + intPart + " и " + fractPart + " в остатке");
    }
}
