package padroesestruturais.decorator;

public class LojaBicicletas {

    public static void main(String[] args) {

        Bicicleta bicicleta = new MountainBike();

        bicicleta = new Capacete(bicicleta);
        bicicleta = new FarolLed(bicicleta);
        bicicleta = new SuporteGarrafa(bicicleta);
        bicicleta = new SeguroRoubo(bicicleta);

        System.out.println("Pedido: " + bicicleta.getDescricao());
        System.out.println("Valor total: R$ " + bicicleta.getPreco());
    }
}