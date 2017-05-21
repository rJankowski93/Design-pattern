package pattern.abstractFactory;

/**
 * Created by Rafi on 09/05/2017.
 */
public class TruckFactory implements AbstractFactory{


    @Override
    public Body createBody() {
        return new TruckBody();
    }

    @Override
    public Engine createEngine() {
        return new TruckEngine();
    }

    @Override
    public Wheel createWheel() {
        return new TruckWheel();
    }
}
