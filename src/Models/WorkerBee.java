package Models;

import Models.Interfaces.Flying;
import Models.Interfaces.Working;

import java.util.Date;

public class WorkerBee extends Bee implements Flying, Working {

    public WorkerBee(int id, String name, Date birthday, float size, boolean isInHouse) {
        super(id, name, birthday, size, isInHouse);
    }

    @Override
    public void fly() {
        System.out.println("Worker Bee Flying");
    }

    @Override
    public void work() {
        System.out.println("Worker Bee bring nectar");
    }
}
