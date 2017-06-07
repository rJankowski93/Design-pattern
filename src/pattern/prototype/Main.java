package pattern.prototype;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike(Bike.Color.Blue, Bike.Color.Red, Bike.Color.Green, Bike.Color.Orange);
        System.out.println("Original bike " + bike.toString());

        Bike copyBike = (Bike) bike.clone();
        System.out.println("Copy bike " + copyBike.toString());
    }
}
