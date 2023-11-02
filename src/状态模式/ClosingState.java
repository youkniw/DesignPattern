package 状态模式;


public class ClosingState extends TCPState {

    @Override
    public void open() {
        System.out.println("TCP连接建立");
        this.tcpServer.setTcpState(TCPServer.OPENING_STATE);
    }

    @Override
    public void listen() {

    }

    @Override
    public void close() {

    }
}
