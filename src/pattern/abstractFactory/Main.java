package pattern.abstractFactory;

public class Main {

    static AbstractFactory getFactory(CarType carType) {
        AbstractFactory abstractFactory = null;
        switch (carType) {
            case CAR:
                abstractFactory = new CarFactory();
                break;
            case TRUCK:
                abstractFactory = new TruckFactory();
                break;
        }
        return abstractFactory;
    }

    public static void main(String[] args) {
        AbstractFactory abstractFactory;

        abstractFactory = Main.getFactory(CarType.CAR);
        Body body = abstractFactory.createBody();
        Engine engine = abstractFactory.createEngine();
        Wheel wheel = abstractFactory.createWheel();
        System.out.println("Factory nr 1");
        System.out.println(body.getName());
        System.out.println(engine.getName());
        System.out.println(wheel.getName());

        abstractFactory = Main.getFactory(CarType.TRUCK);
        Body body2 = abstractFactory.createBody();
        Engine engine2 = abstractFactory.createEngine();
        Wheel wheel2 = abstractFactory.createWheel();
        System.out.println("Factory nr 2");
        System.out.println(body2.getName());
        System.out.println(engine2.getName());
        System.out.println(wheel2.getName());
    }

    enum CarType {
        CAR, TRUCK
    }
}
