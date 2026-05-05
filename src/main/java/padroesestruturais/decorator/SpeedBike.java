package padroesestruturais.decorator;

public class SpeedBike implements Bicicleta {

    @Override
    public String getDescricao() {
        return "Speed Bike";
    }

    @Override
    public double getPreco() {
        return 2500.00;
    }
}