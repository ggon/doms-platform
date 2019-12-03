package doms;

import java.util.ArrayList;
import java.util.List;

public class Routine {

	private final String name;
	private final List<Workout> workouts = new ArrayList<>();

	public Routine(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
