package doms;

public class Cadence {

    public enum RepType {
        REP_COUNT, REP_RANGE
    }

    public long reps;
    public long lowerBoundary;
    public long upperBoundary;
    public RepType repType;

    public void setReps(long reps){
        this.reps = reps;
        this.repType = RepType.REP_COUNT;
    }

    public void setRepRange(long lowerBoundary, long upperBoundary){
        this.lowerBoundary = lowerBoundary;
        this.upperBoundary = upperBoundary;
        this.repType = RepType.REP_RANGE;
    }

    public long getReps(){
        return reps;
    }

    public long getLowerBoundary(){
        return lowerBoundary;
    }

    public long getUpperBoundary(){
        return upperBoundary;
    }

}
