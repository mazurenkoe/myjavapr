public class Math2_CountN {

    //В переменной n хранится натуральное двузначное число.
//Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.

    public static void main(String[] args) {
        int n = 27;
        int result = 0;
        String str = Integer.toString(n);
        for(int i = 0; i < 2; i++) {
            result += Character.getNumericValue(str.charAt(i));
        }
        System.out.println(result);
    }
}


