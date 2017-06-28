package pattern.facade;

public class ComputerFacade {
    private Motherboard motherboard;
    private CPU cpu;
    private HardDrive hardDrive;
    private Memory memory;

    ComputerFacade(){
        motherboard = new Motherboard();
        cpu = new CPU();
        hardDrive = new HardDrive();
        memory = new Memory();
    }

    public void turnOn() {
        motherboard.turnOn();
        cpu.turnOn();
        hardDrive.turnOn();
        memory.turnOn();
        System.out.println("Turn on Computer");
    }

    public void turnOff() {
        motherboard.turnOff();
        cpu.turnOff();
        hardDrive.turnOff();
        memory.turnOff();
        System.out.println("Turn off Computer");
    }

}
