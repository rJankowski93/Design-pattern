package pattern.builder;

public class BuilderLaptop implements Builder {

    Computer laptop = new Laptop();

    @Override
    public Computer getComputer() {
        return laptop;
    }

    @Override
    public void buildMonitor() {
        laptop.setMonitor("Monitor laptop");
        System.out.println("Create " + laptop.getMonitor());
    }

    @Override
    public void buildProcessor() {
        laptop.setProcessor("Procesor laptop");
        System.out.println("Create " + laptop.getProcessor());
    }

    @Override
    public void buildGraphicsCard() {
        laptop.setGraphicsCard("Graphics Card laptop");
        System.out.println("Create " + laptop.getGraphicsCard());
    }

    @Override
    public void buildMotherboard() {
        laptop.setMotherboard("Motherboard laptop");
        System.out.println("Create " + laptop.getMotherboard());
    }

    @Override
    public void buildHardDrive() {
        laptop.setHardDrive("HardDrive laptop");
        System.out.println("Create " + laptop.getHardDrive());
    }

    @Override
    public void buildNetworkCard() {
        laptop.setNetworkCard("Network Card laptop");
        System.out.println("Create " + laptop.getNetworkCard());
    }
}
