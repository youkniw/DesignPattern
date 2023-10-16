package HW8;

public class F1Builder extends Builder {
    @Override
    public void buildBody() {
        car.setBody("F1 body");
    }

    @Override
    public void buildEngine() {
        car.setEngine("F1 engine");
    }

    @Override
    public void buildTire() {
        car.setTire("F1 tire");
    }

    @Override
    public void buildGearbox() {
        car.setGearbox("F1 Gearbox");
    }
}
