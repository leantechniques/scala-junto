package discgolf;

public class Hole {


    private final int holeNumber;
    private final int par;
    private final int numberOfThrows;

    public Hole(int holeNumber, int par, int numberOfThrows) {
        this.holeNumber = holeNumber;
        this.par = par;
        this.numberOfThrows = numberOfThrows;
    }

    public int getHoleNumber() {
        return holeNumber;
    }

    public int getPar() {
        return par;
    }

    public int getNumberOfThrows() {
        return numberOfThrows;
    }
}
