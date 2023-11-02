package 工厂方法模式;

public class POP3ConnectionFactory implements ConnectionFactory {
    @Override
    public Connection buildConnection() {
        return new POP3Connection();
    }
}
