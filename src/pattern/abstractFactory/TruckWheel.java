package pattern.abstractFactory;

/**
 * Created by Rafi on 09/05/2017.
 */
public class TruckWheel implements Wheel {

    String name="TruckWheel";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Wheel generateWheel() {
        return new TruckWheel();
    }
}
