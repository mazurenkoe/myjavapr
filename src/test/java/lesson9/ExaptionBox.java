package lesson9;

import lesson7.Box;

public class ExaptionBox {

    static Box box;
    public static void makeSomeMagic() {
        if(box == null){
            throw new NullPointerException("BOX не инициализирован!");
        }
    }

}
