public class Leche extends DecoradorComplemento {
    Cafe bebida;

    public Leche(Cafe bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Leche";
    }

    @Override
    public double costo() {
        return 0.10 + bebida.costo();
    }
}