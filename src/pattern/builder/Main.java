package pattern.builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new BuilderPC());
        director.createComputer();

        director.setBuilder(new BuilderLaptop());
        director.createComputer();
    }
}
