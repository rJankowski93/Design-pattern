package pattern.factoryMethod;

public class OffRoadCar implements Car {

    public Long power;

    @Override
    public CarFactory.CarType getType() {
        return CarFactory.CarType.OFF_ROAD;
    }

    @Override
    public Car getCar() {
        return this;
    }
}
