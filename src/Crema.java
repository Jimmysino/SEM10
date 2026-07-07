public class Crema extends DecoradorComplemento {
    Cafe bebida;

    public Crema(Cafe bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Crema";
    }

    @Override
    public double costo() {
        return 0.10 + bebida.costo();
    }
}