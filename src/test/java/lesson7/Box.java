package lesson7;

public class Box {

    public double width;
    public double height;
    public double depth;


    public void volume() {
        System.out.print("Oбъeм равен ");
        System.out.println(width * height * depth);
    }

    public void setDim(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }

    public double getVolume() {
        return width * height * depth;
    }

    public void printInfo() {
        System.out.println("Объем коробки: " + getVolume());
        System.out.println("Вес коробки: " + width);
    }

    public Box(int width1, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;

    }

    public Box(){
        width = 20;
    }


}
