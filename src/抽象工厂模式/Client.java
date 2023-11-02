package 抽象工厂模式;

import java.io.InputStream;
import java.util.Properties;

public class Client {
    public static void main(String[] args) {
        Properties properties = new Properties();
        InputStream inputStream = Client.class.getResourceAsStream("/抽象工厂模式/Properties");
        try {
            properties.load(inputStream);
            String type = properties.getProperty("type");
            String className = "抽象工厂模式." + type+"Factory";
            AbstractFactory factory = (AbstractFactory) Class.forName(className).newInstance();
            Connection connection = factory.createConnection();
            Statement statement = factory.createStatement();

            connection.connect();
            statement.state();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

