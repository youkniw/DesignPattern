package HW8;

public class SportCarBuilder extends Builder {
    @Override
    public void buildBody() {
        car.setBody("SportCar body");
    }

    @Override
    public void buildEngine() {
        car.setEngine("SportCar engine");
    }

    @Override
    public void buildTire() {
        car.setTire("SportCar tire");
    }

    @Override
    public void buildGearbox() {
        car.setGearbox("SportCar gearbox");
    }
}
