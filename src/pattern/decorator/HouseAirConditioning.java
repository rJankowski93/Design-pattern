package pattern.decorator;

public class HouseAirConditioning extends HouseDecorator {

    public HouseAirConditioning(House house) {
        super(house);
    }

    public String show() {
        return house.show() + " with air contitioning";
    }
}
