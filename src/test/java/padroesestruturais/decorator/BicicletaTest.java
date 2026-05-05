package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicicletaTest {

    @Test
    public void deveRetornarPrecoMountainBikeComAcessorios() {
        Bicicleta bicicleta = new MountainBike();

        bicicleta = new Capacete(bicicleta);
        bicicleta = new FarolLed(bicicleta);
        bicicleta = new SuporteGarrafa(bicicleta);

        assertEquals(1775.00, bicicleta.getPreco());
    }

    @Test
    public void deveRetornarDescricaoMountainBikeComAcessorios() {
        Bicicleta bicicleta = new MountainBike();

        bicicleta = new Capacete(bicicleta);
        bicicleta = new FarolLed(bicicleta);

        assertEquals("Mountain Bike + Capacete + Farol LED", bicicleta.getDescricao());
    }

    @Test
    public void deveRetornarPrecoSpeedBikeComSeguro() {
        Bicicleta bicicleta = new SpeedBike();

        bicicleta = new SeguroRoubo(bicicleta);

        assertEquals(2800.00, bicicleta.getPreco());
    }
}