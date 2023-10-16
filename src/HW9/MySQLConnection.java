package HW9;

public class MySQLConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("MySQL connection");
    }
}

