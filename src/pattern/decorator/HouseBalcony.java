package pattern.decorator;

public class HouseBalcony extends HouseDecorator {

    public HouseBalcony(House house) {
        super(house);
    }

    public String show() {
        return house.show() + " with balcony";
    }
}
