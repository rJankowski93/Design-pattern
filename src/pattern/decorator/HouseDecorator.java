package pattern.decorator;

public abstract class HouseDecorator implements House{

    public House house;

    public HouseDecorator(House house) {
        this.house = house;
    }
}
