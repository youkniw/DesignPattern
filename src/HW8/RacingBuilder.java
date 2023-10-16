package HW8;

public class RacingBuilder extends Builder {
    @Override
    public void buildBody() {
        car.setBody("Racing body");
    }

    @Override
    public void buildEngine() {
        car.setEngine("Racing engine");
    }

    @Override
    public void buildTire() {
        car.setTire("Racing tire");
    }

    @Override
    public void buildGearbox() {
        car.setGearbox("Racing gearbox");
    }
}
