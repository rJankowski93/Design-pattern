package pattern.abstractFactory;

/**
 * Created by Rafi on 09/05/2017.
 */
public class TruckBody implements Body {

    String name="TruckBody";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Body generateBody() {
        return new TruckBody();
    }
}
