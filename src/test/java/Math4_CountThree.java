public class Math4_CountThree {

//  В переменной n хранится натуральное трёхзначное число.
//  Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.

    public static void main(String[] args) {
        int n = 2226;
        int result = countNumberSum(n);
        System.out.println(result);
    }

    public static int countNumberSum (int n)
    {
        int result = 0;
        int count = String.valueOf(n).length();
        String str = Integer.toString(n);

        for (int i = 0; i < count; i++) {
            result += Character.getNumericValue(str.charAt(i));
        }
        return result;
    }
}
