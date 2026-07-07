public class Soya extends DecoradorComplemento {
    Cafe bebida;

    public Soya(Cafe bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Soya";
    }

    @Override
    public double costo() {
        return 0.15 + bebida.costo();
    }
}