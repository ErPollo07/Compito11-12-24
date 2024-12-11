public class Quadrato {
    private double lato;

    /**
     * Instantiate the object Quadrato specifying the length of the sides
     *
     * @param lato the side of the square
     */
    public Quadrato(double lato) {
        this.lato = lato;
    }

    public double getLato() {
        return lato;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }

    public double calcolaArea() {
        return lato * lato;
    }


    /**
     * This method compare the area of the current object and the one passed as parameter.
     *
     * @param altro object to compare with the current one
     * @return 1 if the area of the current object is grader than the one of the object passed as parameter ;
     *          -1 if the area of the current object is less than the one of the object passed as parameter ;
     *          0 if the two areas are equals.
     */
    public int compareTo(Quadrato altro) {
        double areaQuesto = this.calcolaArea();
        double areaAltro = altro.calcolaArea();
        return Double.compare(areaQuesto, areaAltro);
    }

    public String toString() {
        return String.format("Lato: %f, Area: %.2f", calcolaArea());
    }
}