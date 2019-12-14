package doms;

import java.util.ArrayList;
import java.util.List;

public class Routine {

	private String name;
	private List<Workout> workouts = new ArrayList<>();

	public Routine() {
	}

	public Routine(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
