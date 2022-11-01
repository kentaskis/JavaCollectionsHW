package Models;

import java.util.Date;

public class YoungWorkerBee extends WorkerBee{
    public YoungWorkerBee(int id, String name, Date birthday, float size, boolean isInHouse) {
        super(id, name, birthday, size, isInHouse);
    }

    public void bringWatter() {
        System.out.println("YoungWorkerBee Bring watter");
    }
}