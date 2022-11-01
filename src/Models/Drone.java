package Models;

import Models.Interfaces.Flying;
import Models.Interfaces.Reproducing;

import java.util.Date;

public class Drone extends Bee implements Reproducing, Flying {
    public Drone(int id, String name, Date birthday, float size, boolean isInHouse) {
        super(id, name, birthday, size, isInHouse);
    }

    @Override
    public void reproduce() {
        System.out.println("Drone Interbreed");
    }

    @Override
    public void fly() {
        System.out.println("Drone Flying");
    }
}
