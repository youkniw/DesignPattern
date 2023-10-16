package HW8;

public abstract class Builder {
    protected Car car = new Car();

    public abstract void buildBody();

    public abstract void buildEngine();

    public abstract void buildTire();

    public abstract void buildGearbox();

    public Car getResult() {
        return car;
    }
}
