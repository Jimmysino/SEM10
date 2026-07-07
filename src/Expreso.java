public class Expreso extends Cafe {
    public Expreso() {
        descripcion = "Cafe Expreso";
    }

    @Override
    public double costo() {
        return 1.99;
    }
}