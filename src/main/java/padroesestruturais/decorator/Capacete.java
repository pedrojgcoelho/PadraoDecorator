package padroesestruturais.decorator;

public class Capacete extends BicicletaDecorator {

    public Capacete(Bicicleta bicicleta) {
        super(bicicleta);
    }

    @Override
    public String getDescricao() {
        return bicicleta.getDescricao() + " + Capacete";
    }

    @Override
    public double getPreco() {
        return bicicleta.getPreco() + 150.00;
    }
}