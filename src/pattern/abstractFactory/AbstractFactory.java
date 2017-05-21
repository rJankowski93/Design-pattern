package pattern.abstractFactory;

/**
 * Created by Rafi on 09/05/2017.
 */
public interface AbstractFactory {

    Body createBody();

    Engine createEngine();

    Wheel createWheel();

}
