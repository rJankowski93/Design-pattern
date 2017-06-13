package pattern.decorator;

public class Main {
    public static void main(String[] args) {
        House house1 = new Apartment();
        House house2 = new Flat();
        House house3 = new Flat();
        System.out.println("Without equipment");
        System.out.println("House 1 "+house1.show());
        System.out.println("House 2 "+house2.show());
        System.out.println("House 3 "+house3.show());

        System.out.println("With equipment");
        house1 = new HouseAirConditioning(house1);
        house2 = new HouseBalcony(house2);
        house3 = new HouseBalcony(new HouseAirConditioning(house3));
        System.out.println("House 1 "+house1.show());
        System.out.println("House 2 "+house2.show());
        System.out.println("House 3 "+house3.show());

    }
}
