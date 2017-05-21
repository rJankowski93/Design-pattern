package pattern.abstractFactory;

/**
 * Created by Rafi on 09/05/2017.
 */
public class TruckEngine implements Engine {

    String name="TruckEngine";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Engine generateEngine() {
        return new TruckEngine();
    }
}
