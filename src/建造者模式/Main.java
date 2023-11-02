package 建造者模式;

public class Main {
    public static void main(String[] args) {
        Builder builder = new F1Builder();
        Director director = new Director(builder);
        Car car = director.construct();
        System.out.println(car.getBody());
        System.out.println(car.getEngine());
        System.out.println(car.getTire());
        System.out.println(car.getGearbox());
    }
}
