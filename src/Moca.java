public class Moca extends DecoradorComplemento {
    Cafe bebida;

    public Moca(Cafe bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Moca";
    }

    @Override
    public double costo() {
        return 0.20 + bebida.costo();
    }
}