package pattern.decorator;

public class Apartment implements House{
    public String name = "Apartment";

    public String show() {
        return name;
    }
}
