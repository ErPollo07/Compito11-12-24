public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(15, 18);
        Quadrato quadrato = new Quadrato(6);
        TriangoloRettangolo triangolo = new TriangoloRettangolo(3, 4);
        System.out.println(rettangolo.toString());
        System.out.println(quadrato.toString());
        System.out.println(triangolo.toString());


        int risultatoCompareTo = rettangolo.compareTo(quadrato);

        if (risultatoCompareTo < 0) {
            System.out.println("Il rettangolo ha un'area minore del rettangolo2.");
        } else if (risultatoCompareTo > 0) {
            System.out.println("Il rettangolo ha un'area minore o uguale a quella del rettangolo2.");
        }

        System.out.println("Le aree sono uguali");

        // the perimeter depend on the base and height
        // if the perimeter is considered like an attribute every
        // time that the base or height are reset the class has to recalculate the perimeter
        // With the method the class has to calculate the perimeter only if it's necessary.


        // MODIFY
        // * use toString and not getInformazione because they are the same
        // * correct if the evaluate the result of the compareTo

    }
}
