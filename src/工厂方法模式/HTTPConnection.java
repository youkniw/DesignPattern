package 工厂方法模式;

public class HTTPConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("execute HTTP connection");
    }
}
