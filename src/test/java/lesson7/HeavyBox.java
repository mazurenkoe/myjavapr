package lesson7;

public class HeavyBox extends Box {


    int weidth; // вес коробки
    public void printInfo(){
        System.out.println("Объем коробки: "+getVolume());
        System.out.println("Вес коробки: "+weidth);
        super.printInfo();
    }

    public HeavyBox (int width, int heihth, int depth, int weidth){

        super (width, heihth, depth);
        this.weidth = weidth;
    }


}
