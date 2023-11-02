package 工厂方法模式;

public class IMAPConnectionFactory implements ConnectionFactory {
    @Override
    public Connection buildConnection() {
        return new IMAPConnection();
    }
}
