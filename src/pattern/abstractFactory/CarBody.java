package pattern.abstractFactory;

/**
 * Created by Rafi on 09/05/2017.
 */
public class CarBody implements Body {

    String name="CarBody";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Body generateBody() {
        return new CarBody();
    }
}
