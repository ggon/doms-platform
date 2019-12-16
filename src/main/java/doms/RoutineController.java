package doms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
	A Routine is a set of workouts.
	For example: Chest Day, Monday Routine, Thanksgiving WOD
 */
@RestController
public class RoutineController {

	@Autowired
	private RoutineManager routineManager;

	@PostMapping(value="/routine", consumes = "application/json")
	public Routine createRoutine(@RequestBody Routine routine) {
		return routineManager.createRoutine(routine.getName());
	}

	@GetMapping(value="/routine/{id}")
	public Routine getRoutine(@PathVariable("id") long id) {
		return routineManager.getRoutine(id);
	}

}
