package doms;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class WorkoutController {

	private final AtomicLong counter = new AtomicLong();

	@RequestMapping(value="/workout", method=RequestMethod.GET)
	public Workout workout(@RequestParam String name, @RequestParam long reps, @RequestParam long sets) {
		return new Workout(counter.incrementAndGet(), name, reps, sets);
	}
}
