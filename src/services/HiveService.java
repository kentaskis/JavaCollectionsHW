package services;

import database.DB;
import models.Bee;
import models.WorkerBee;
import lombok.Getter;
import lombok.Setter;

import java.util.Deque;
import java.util.Map;
import java.util.Set;

@Getter
@Setter
public class HiveService {
    private DB db = new DB();

    public void addBeeInHive(Bee bee) {
        db.addBeeToHive(db.getHive().size() + 1, bee);
        db.addClassBee(bee);
    }

    public WorkerBee sendBeeToRest(WorkerBee bee) {
        db.sendBeeToRest(bee);
        return bee;
    }

    public Map<Bee, Integer> getAllBeeInHive() {
        return db.getHive();
    }

    public Set<String> getUniqueTypesOfBee() {
        return db.getClassBee();
    }

    public Deque<WorkerBee> getAllBeeOnVocation() {
        return db.getBeeOnVocation();
    }

    public WorkerBee getRestedBee() {
        return db.getRestedBee();
    }

    public WorkerBee getTiredBee() {
        return db.getTiredBee();
    }
}