package HW4;

public class Client {
    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new HTTPConnectionFactory();
        Connection connection = connectionFactory.buildConnection();
        connection.connect();
    }
}
