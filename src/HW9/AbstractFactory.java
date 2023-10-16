package HW9;

public interface AbstractFactory {
    Connection createConnection();

    Statement createStatement();
}
