package Models;

import java.util.Date;

public class AdultWorkerBee extends WorkerBee {
    public AdultWorkerBee(int id, String name, Date birthday, float size, boolean isInHouse) {
        super(id, name, birthday, size, isInHouse);
    }

    public void protect(){
        System.out.println("AdultWorkerBee Protect");
    }

    public void feed() {
        System.out.println("AdultWorkerBee Feed");
    }

    public void cleanUp() {
        System.out.println("AdultWorkerBee Clean Up");
    }
}