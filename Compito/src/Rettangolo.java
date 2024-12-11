import java.util.concurrent.RecursiveTask;

public class Rettangolo {
    private double base;
    private double altezza;

    /**
     * Instantiate the object Rettangolo specifying the length of the base and height
     *
     * @param base the length of base of the rect
     * @param altezza the length of height of the rect
     */
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double calcolaPerimetro() {
        return 2 * base + 2 * altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double calcolaArea() {
        return base * altezza;
    }


    /**
     * This method compare the area of the current object and the one passed as parameter.
     * There are overloads of this method to work with all the figure.
     *
     * @param altro object to compare with the current one
     * @return 1 if the area of the current object is grader than the one of the object passed as parameter ;
     *          -1 if the area of the current object is less than the one of the object passed as parameter ;
     *          0 if the two areas are equals ;
     *          2 if the Object is not a Quadrato or Circonferenza or TriangoloRettangolo or Rettangolo.
     */
    public int compareTo(Rettangolo altro) {
        double areaQuesto = this.calcolaArea();
        double areaAltro = altro.calcolaArea();
        return Double.compare(areaQuesto, areaAltro);
    }

    public int compareTo(Quadrato altro) {
        double areaQuesto = this.calcolaArea();
        double areaAltro = altro.calcolaArea();
        return Double.compare(areaQuesto, areaAltro);
    }

    public int compareTo(TriangoloRettangolo altro) {
        double areaQuesto = this.calcolaArea();
        double areaAltro = altro.calcolaArea();
        return Double.compare(areaQuesto, areaAltro);
    }

    public int compareTo(Circonferenza altro) {
        double areaQuesto = this.calcolaArea();
        double areaAltro = altro.calcolaArea();
        return Double.compare(areaQuesto, areaAltro);
    }


    public String toString() {
        return String.format("Base: %f, Altezza: %f, Perimetro: %f, Area: %f",
                base, altezza, calcolaPerimetro(), calcolaArea());
    }
}