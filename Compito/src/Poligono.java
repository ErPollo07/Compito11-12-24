public class Poligono {
    private int numeroLati;
    private double lunghezzaLato;

    /**
     * Instantiate the object Poligono specifying the number of the side and length of them.
     * All side have the same length
     *
     * @param numeroLati the number of side of the polygon
     * @param lunghezzaLato the length of the sides of the polygon
     */
    public Poligono(int numeroLati, double lunghezzaLato) {
        this.numeroLati = numeroLati;
        this.lunghezzaLato = lunghezzaLato;
    }

    public double calcolaPerimetro() {
        return this.numeroLati * this.lunghezzaLato;
    }

    @Override
    public String toString() {
        return String.format("Poligono con %d lati di lunghezza %f, perimetro: %.2f", numeroLati, lunghezzaLato, calcolaPerimetro());
    }
}
