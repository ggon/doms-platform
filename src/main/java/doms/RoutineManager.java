package doms;

public class RoutineManager {

    public RoutineManager(){
        System.out.println("ok workout manager is initailized now");
    }

    public Routine createRoutine(String name) {
        return new Routine(name);
    }

    public void addWorkoutToRoutine(long routineId, long workoutId) {
        // insert into database the
    }
}
