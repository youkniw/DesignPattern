package 工厂方法模式;

public class POP3Connection implements Connection {
    @Override
    public void connect() {
        System.out.println("execute POP3 protocol");
    }
}
