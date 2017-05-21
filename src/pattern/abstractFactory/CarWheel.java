package pattern.abstractFactory;

/**
 * Created by Rafi on 09/05/2017.
 */
public class CarWheel implements Wheel {

    String name="CarWheel";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Wheel generateWheel() {
        return new CarWheel();
    }
}
