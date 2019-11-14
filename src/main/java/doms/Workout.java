package doms;

public class Workout {

	private final long id;
	private final String name;
	private final long reps;
	private final long sets;

	public Workout(long id, String name, long reps, long sets) {
		this.id = id;
		this.name = name;
		this.sets = sets;
		this.reps = reps;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public long getReps() {
		return reps;
	}

	public long getSets() {
		return sets;
	}
}
