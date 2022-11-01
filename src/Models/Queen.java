package Models;

import Models.Interfaces.Oviposition;
import Models.Interfaces.Reproducing;

import java.util.Date;

public class Queen extends Bee implements Oviposition, Reproducing {

    public Queen(int id, String name, Date birthday, float size, boolean isInHouse) {
        super(id, name, birthday, size, isInHouse);
    }

    @Override
    public void makeNewEggs() {
        System.out.println("Queen Make New Egg");
    }

    @Override
    public void reproduce() {
        System.out.println("Queen Interbreed");
    }

    @Override
    public void fly() {
        System.out.println("Queen flying to Interbreed");
    }
}
