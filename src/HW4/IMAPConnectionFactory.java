package HW4;

public class IMAPConnectionFactory implements ConnectionFactory {
    @Override
    public Connection buildConnection() {
        return new IMAPConnection();
    }
}
