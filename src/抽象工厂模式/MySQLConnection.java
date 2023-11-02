package 抽象工厂模式;

public class MySQLConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("MySQL connection");
    }
}

