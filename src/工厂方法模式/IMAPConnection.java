package 工厂方法模式;

public class IMAPConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("execute IMAP protocol");
    }
}
