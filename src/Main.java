public class Main {
    public static void main(String[] args) {

        Cafe pedidoA = new Expreso();
        pedidoA = new Leche(pedidoA);
        pedidoA = new Soya(pedidoA);
        pedidoA = new Crema(pedidoA);
        pedidoA = new Moca(pedidoA);
        System.out.println("a. Pedido: Café expreso con leche, soya, crema y moca");
        System.out.println("Descripción: " + pedidoA.getDescripcion());
        System.out.println("Costo Total: $" + pedidoA.costo());
        System.out.println();

        Cafe pedidoB = new Descafeinado();
        pedidoB = new Moca(pedidoB);
        pedidoB = new Moca(pedidoB);
        pedidoB = new Soya(pedidoB);
        pedidoB = new Leche(pedidoB);

        System.out.println("b. Pedido: Café descafeinado con doble moca, soya y leche");
        System.out.println("Descripción: " + pedidoB.getDescripcion());
        System.out.println("Costo Total: $" + pedidoB.costo());
        System.out.println();

        Cafe pedidoC = new Batido();
        pedidoC = new Crema(pedidoC);
        pedidoC = new Crema(pedidoC);
        pedidoC = new Leche(pedidoC);
        pedidoC = new Soya(pedidoC);
        pedidoC = new Soya(pedidoC);
        pedidoC = new Moca(pedidoC);
        pedidoC = new Moca(pedidoC);

        System.out.println("c. Pedido: Café batido con doble crema, doble leche, doble soya y doble moca");
        System.out.println("Descripción: " + pedidoC.getDescripcion());
        System.out.println("Costo Total: $" + pedidoC.costo());
        System.out.println();

        Cafe pedidoD = new TostadoNegro();
        pedidoD = new Crema(pedidoD);
        pedidoD = new Crema(pedidoD);
        pedidoD = new Soya(pedidoD);
        pedidoD = new Soya(pedidoD);
        pedidoD = new Soya(pedidoD);

        System.out.println("d. Pedido: Café tostado negro con doble crema y triple soya");
        System.out.println("Descripción: " + pedidoD.getDescripcion());
        System.out.println("Costo Total: $" + pedidoD.costo());

    }

}