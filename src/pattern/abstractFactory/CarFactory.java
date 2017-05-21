package pattern.abstractFactory;

/**
 * Created by Rafi on 09/05/2017.
 */
public class CarFactory implements AbstractFactory {
    @Override
    public Body createBody() {
        return new CarBody();
    }

    @Override
    public Engine createEngine() {
        return new CarEngine();
    }

    @Override
    public Wheel createWheel() {
        return new CarWheel();
    }
}
