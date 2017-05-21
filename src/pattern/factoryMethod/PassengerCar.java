package pattern.factoryMethod;

public class PassengerCar implements Car {

    public Long numberSeats;

    @Override
    public CarFactory.CarType getType() {
        return  CarFactory.CarType.PASSENGER;
    }

    @Override
    public Car getCar() {
        return this;
    }
}
