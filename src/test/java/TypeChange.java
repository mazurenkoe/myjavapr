public class TypeChange {

    public static void main(String[] arg) {
        int iint = 123;
        char cchar;
        System.out.println(cchar = (char) iint);

        float xFloat = 3.8644f;
        char cchar1;
        System.out.println(cchar1 = (char) xFloat);

        float xfloatq = 3.8644f;
        char cchar12;
        int iint12;
        cchar12 = (char) xfloatq;
        System.out.println(iint12 = (int) cchar12);
    }
}
