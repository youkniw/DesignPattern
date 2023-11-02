package 抽象工厂模式;

public interface AbstractFactory {
    Connection createConnection();

    Statement createStatement();
}
