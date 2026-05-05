package padroesestruturais.decorator;

public class SeguroRoubo extends BicicletaDecorator {

    public SeguroRoubo(Bicicleta bicicleta) {
        super(bicicleta);
    }

    @Override
    public String getDescricao() {
        return bicicleta.getDescricao() + " + Seguro contra Roubo";
    }

    @Override
    public double getPreco() {
        return bicicleta.getPreco() + 300.00;
    }
}