package 状态模式;


public class Test {
    public static void main(String[] args) {
        TCPServer tcpServer = new TCPServer();
        tcpServer.setTcpState(new OpeningState());
        tcpServer.listen();
        tcpServer.open();
        tcpServer.listen();
        tcpServer.close();
        tcpServer.listen();
    }
}
