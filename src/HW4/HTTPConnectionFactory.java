package HW4;

public class HTTPConnectionFactory implements ConnectionFactory {
    @Override
    public Connection buildConnection() {
        return new HTTPConnection();
    }
}
