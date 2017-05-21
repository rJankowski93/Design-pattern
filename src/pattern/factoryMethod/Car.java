package pattern.factoryMethod;

/**
 * Created by Rafi on 03/05/2017.
 */
public interface Car {

    CarFactory.CarType getType();

    Car getCar();
}
