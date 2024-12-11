public class Circonferenza {
    private double raggio;

    /**
     * Instantiate the object Circonferenza specifying the radius
     *
     * @param raggio the radius of the circumference
     */
    public Circonferenza(double raggio) {
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    public double calcolaArea() {
        return Math.PI * raggio * raggio;
    }

    /**
     * This method compare the area of the current object and the one passed as parameter.
     *
     * @param altro object to compare with the current one
     * @return 1 if the area of the current object is grader than the one of the object passed as parameter ;
     *          -1 if the area of the current object is less than the one of the object passed as parameter ;
     *          0 if the two areas are equals.
     */
    public int compareTo(Circonferenza altro) {
        double areaQuesto = this.calcolaArea();
        double areaAltro = altro.calcolaArea();
        return Double.compare(areaQuesto, areaAltro);
    }
}