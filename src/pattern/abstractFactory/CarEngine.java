package pattern.abstractFactory;

/**
 * Created by Rafi on 09/05/2017.
 */
public class CarEngine implements Engine {

    String name="CarEngine";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Engine generateEngine() {
        return new CarEngine();
    }
}
