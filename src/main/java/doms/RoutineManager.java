package doms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoutineManager {

    @Autowired
    private RoutineRepository routineRepository;

    public Routine createRoutine(String name) {
        Routine someNewRoutine = new Routine(name);
        routineRepository.save(someNewRoutine);
        return someNewRoutine;
    }

    public Routine getRoutine(long id) {
        return new Routine("id_"+id+"_routine");
    }

    public void addWorkoutToRoutine(long routineId, long workoutId) {
        // insert into database the
    }
}
