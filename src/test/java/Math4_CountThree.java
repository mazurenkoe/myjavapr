public class Math4_CountThree {

//  В переменной n хранится натуральное трёхзначное число.
//  Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.

    public static void main(String[] args) {
        int n = 222;
        int result = 0;
        String str = Integer.toString(n);
        for(int i = 0; i < 3; i++) {
            result += Character.getNumericValue(str.charAt(i));
        }
        System.out.println(result);
    }
}
