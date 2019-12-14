package doms;

public class WorkoutManager {

    public Workout createWorkout(String name) {
        return new Workout(name);
    }
}
