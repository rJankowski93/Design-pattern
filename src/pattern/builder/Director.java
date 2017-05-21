package pattern.builder;

public class Director {
    private Builder builder;

    public Computer createComputer() {
        builder.buildMonitor();
        builder.buildGraphicsCard();
        builder.buildHardDrive();
        builder.buildMonitor();
        builder.buildProcessor();
        builder.buildNetworkCard();
        return builder.getComputer();
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
}
