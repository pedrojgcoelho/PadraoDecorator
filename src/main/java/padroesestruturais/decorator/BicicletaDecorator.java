package padroesestruturais.decorator;

public abstract class BicicletaDecorator implements Bicicleta {

    protected Bicicleta bicicleta;

    public BicicletaDecorator(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    @Override
    public String getDescricao() {
        return bicicleta.getDescricao();
    }

    @Override
    public double getPreco() {
        return bicicleta.getPreco();
    }
}
