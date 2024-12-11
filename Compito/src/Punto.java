public class Punto {
    private double x;
    private double y;

    /**
     * Istantiate the object Punto with its x and y coords
     *
     * @param x the x coordinate of the point
     * @param y the y coordinate of the point
     */
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Calcola la distanza tra l'oggetto che chiama il metodo e quello passato come parametro
     * @param p punto con cui calcolare la distanza
     * @return la distanza l'oggetto che chiama il metodo e quello passato come parametro
     */
    public double distanza(Punto p) {
        return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
