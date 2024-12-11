public class TriangoloRettangolo {
    private double base;
    private double altezza;

    /**
     * Istanzia l'oggetto TriangoloRettangolo specificanto la lunghezza di base e altezza.
     * @param base
     * @param altezza
     */
    public TriangoloRettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
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
        return (base * altezza) / 2;
    }

    /**
     * This method compare the area of the current object and the one passed as parameter.
     *
     * @param altro object to compare with the current one
     * @return 1 if the area of the current object is grader than the one of the object passed as parameter ;
     *          -1 if the area of the current object is less than the one of the object passed as parameter ;
     *          0 if the two areas are equals.
     */
    public int compareTo(TriangoloRettangolo altro) {
        double areaQuesto = this.calcolaArea();
        double areaAltro = altro.calcolaArea();
        return Double.compare(areaQuesto, areaAltro);
    }

    public String toString() {
        return String.format("Base: %f, Altezza: %f, Area: %f", base, altezza, calcolaArea());
    }
}