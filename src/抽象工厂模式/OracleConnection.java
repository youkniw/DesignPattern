package 抽象工厂模式;

public class OracleConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Oracle connection");
    }
}
