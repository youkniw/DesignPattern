package 外观模式;


public class Test {
    public static void main(String[] args) {

        Phone phone = new Phone(new Account(), new Message(), new Image());
        phone.save();
    }
}
