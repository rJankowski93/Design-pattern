package pattern.factoryMethod;

public class PickupTruck implements Car {

    public double capacity;

    @Override
    public CarFactory.CarType getType() {
        return CarFactory.CarType.PICKUP;
    }

    @Override
    public Car getCar() {
        return this;
    }
}
