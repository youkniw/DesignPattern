package HW8;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Car construct() {
        builder.buildBody();
        builder.buildEngine();
        builder.buildTire();
        builder.buildGearbox();
        return builder.getResult();
    }
}

