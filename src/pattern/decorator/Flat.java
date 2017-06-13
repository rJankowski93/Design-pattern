package pattern.decorator;

public class Flat implements House{
    public String name = "Flat";

    public String show() {
        return name;
    }
}
