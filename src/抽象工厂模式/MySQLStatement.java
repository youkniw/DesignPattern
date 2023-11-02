package 抽象工厂模式;

public class MySQLStatement implements Statement {
    @Override
    public void state() {
        System.out.println("MySQL statement");
    }
}
