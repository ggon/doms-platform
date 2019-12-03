package doms;

public class WorkoutManager {

    public WorkoutManager() {
        System.out.println("ok workout manager is initailized now");
    }

    public Workout createWorkout(String name) {
        return new Workout(name);
    }
}
