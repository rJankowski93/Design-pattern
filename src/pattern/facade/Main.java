package pattern.facade;

public class Main {
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();
        //TURN ON
        computerFacade.turnOn();
        //TURN OFF
        computerFacade.turnOff();
    }
}
