package doms;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class WorkoutController {

	private final AtomicLong counter = new AtomicLong();

	//TODO: reps and sets params aren't working. figure it out!
	@RequestMapping(value="/workout", method=RequestMethod.GET)
	public Workout workout(@RequestParam(value="name", defaultValue="chinups") String name,
						   @RequestParam(value="reps", defaultValue="8") long reps,
						   @RequestParam(value="sets", defaultValue="4") long sets) {
		return new Workout(counter.incrementAndGet(), name, reps, sets);
	}
}
