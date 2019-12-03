package doms;

public class Workout {

    public final String name;
    public Cadence cadence;

    public Workout(String name) {
        this.name = name;
    }

    public void addCadence(Cadence cadence) {
        this.cadence = cadence;
    }

    public String getName(){
        return this.name;
    }
}
