package pattern.factoryMethod;

public class CarFactory {

    enum CarType {
        OFF_ROAD, PASSENGER, PICKUP
    }

    public static Car createCar(CarType type) {
        Car car = null;
        switch (type) {
            case OFF_ROAD:
                car = new OffRoadCar();
            case PASSENGER:
                car = new PassengerCar();
            case PICKUP:
                car = new PickupTruck();
        }
        return car;
    }
}
