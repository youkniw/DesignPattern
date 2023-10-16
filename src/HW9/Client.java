package HW9;

import java.io.InputStream;
import java.util.Properties;

public class Client {
    public static void main(String[] args) {
        Properties properties = new Properties();
        InputStream inputStream = Client.class.getResourceAsStream("/HW9/Properties");
        try {
            properties.load(inputStream);
            String type = properties.getProperty("type");
            String className = "HW9." + type+"Factory";
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

