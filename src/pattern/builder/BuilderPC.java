package pattern.builder;

public class BuilderPC implements Builder {

    Computer pc = new PC();

    @Override
    public Computer getComputer() {
        return pc;
    }

    @Override
    public void buildMonitor() {
        pc.setMonitor("Monitor pc");
        System.out.println("Create " + pc.getMonitor());
    }

    @Override
    public void buildProcessor() {
        pc.setProcessor("Procesor pc");
        System.out.println("Create " + pc.getProcessor());
    }

    @Override
    public void buildGraphicsCard() {
        pc.setGraphicsCard("Graphics Card pc");
        System.out.println("Create " + pc.getGraphicsCard());
    }

    @Override
    public void buildMotherboard() {
        pc.setMotherboard("Motherboard pc");
        System.out.println("Create " + pc.getMotherboard());
    }

    @Override
    public void buildHardDrive() {
        pc.setHardDrive("HardDrive pc");
        System.out.println("Create " + pc.getHardDrive());
    }

    @Override
    public void buildNetworkCard() {
        pc.setNetworkCard("Network Card pc");
        System.out.println("Create " + pc.getNetworkCard());
    }
}
