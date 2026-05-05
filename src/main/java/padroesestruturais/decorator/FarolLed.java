package padroesestruturais.decorator;

public class FarolLed extends BicicletaDecorator {

    public FarolLed(Bicicleta bicicleta) {
        super(bicicleta);
    }

    @Override
    public String getDescricao() {
        return bicicleta.getDescricao() + " + Farol LED";
    }

    @Override
    public double getPreco() {
        return bicicleta.getPreco() + 80.00;
    }
}