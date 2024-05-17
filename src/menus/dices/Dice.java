package menus.dices;

import java.util.Random;

public abstract class Dice {
    protected int faces;

    public Dice(int faces) {
        this.faces = faces;
    }


    public int roll(){
        Random value = new Random();
        return value.nextInt(faces) + 1;
    }
}
