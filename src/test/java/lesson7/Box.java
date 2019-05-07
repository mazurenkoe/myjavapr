package lesson7;

public class Box {

    public double width;
    public double height;
    public double depth;

    public void volume()  {
        System.out.print("Oбъeм равен ");
        System.out.println(width * height * depth);
    }

    public void setDim(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }

}
