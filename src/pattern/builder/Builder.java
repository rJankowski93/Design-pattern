package pattern.builder;

public interface Builder {

    Computer getComputer();

    void buildMonitor();

    void buildProcessor();

    void buildGraphicsCard();

    void buildMotherboard();

    void buildHardDrive();

    void buildNetworkCard();
}
