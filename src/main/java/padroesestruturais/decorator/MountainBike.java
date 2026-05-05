package padroesestruturais.decorator;

public class MountainBike implements Bicicleta {

    @Override
    public String getDescricao() {
        return "Mountain Bike";
    }

    @Override
    public double getPreco() {
        return 1500.00;
    }
}