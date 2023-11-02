package 工厂方法模式;

public class Client {
    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new HTTPConnectionFactory();
        Connection connection = connectionFactory.buildConnection();

        connection.connect();
    }
}
