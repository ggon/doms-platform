package doms;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
	A Workout is a single exercise that is usually tied to a number of sets and reps.
	For example: Shoulder Press, Squats, Incline Hammer Press
 */
@RestController
public class WorkoutController {

	private final WorkoutManager workoutManager = new WorkoutManager();

	@RequestMapping(value="/workout", method=RequestMethod.POST)
	public Workout workout(@RequestParam String name) {
		return workoutManager.createWorkout(name);
	}

}
