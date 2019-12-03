package doms;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/*
	A Routine is a set of workouts.
	For example: Chest Day, Monday Routine, Thanksgiving WOD
 */
@RestController
public class RoutineController {

	private final RoutineManager routineManager = new RoutineManager();

	@RequestMapping(value="/routine", method=RequestMethod.POST)
	public Routine routine(@RequestParam String name) {
		return routineManager.createRoutine(name);
	}

}
