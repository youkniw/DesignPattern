package 抽象工厂模式;

public class OracleStatement implements Statement {
    @Override
    public void state() {
        System.out.println("Oracle Statement");
    }
}

