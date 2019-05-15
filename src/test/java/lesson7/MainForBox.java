package lesson7;

public class MainForBox {

    public static void main(String[] args) {
        Box myBox = new Box(10,10,10);
        Box cube = new Box(10,10,10);
        Box parallelepiped = new Box(10,10,10);

        cube.width = 10;
        cube.height = 10;
        cube.depth = 10;
        parallelepiped.width = 10;
        parallelepiped.height = 20;
        parallelepiped.depth = 15;

        cube.volume();
        parallelepiped.volume();

    }
}

