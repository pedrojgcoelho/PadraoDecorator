package padroesestruturais.decorator;

public class SuporteGarrafa extends BicicletaDecorator {

    public SuporteGarrafa(Bicicleta bicicleta) {
        super(bicicleta);
    }

    @Override
    public String getDescricao() {
        return bicicleta.getDescricao() + " + Suporte para Garrafa";
    }

    @Override
    public double getPreco() {
        return bicicleta.getPreco() + 45.00;
    }
}