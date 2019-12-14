package doms;

public class RoutineManager {

    public RoutineManager(){
        System.out.println("ok workout manager is initailized now");
    }

    public Routine createRoutine(String name) {
        return new Routine(name);
    }

    public Routine getRoutine(long id) {
        return new Routine("id_"+id+"_routine");
    }

    public void addWorkoutToRoutine(long routineId, long workoutId) {
        // insert into database the
    }
}
