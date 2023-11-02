package 状态模式;


public class OpeningState extends TCPState {


    @Override
    public void open() {
        System.out.println("TCP连接建立");
    }

    @Override
    public void listen() {
        System.out.println("TCP连接开始监听");
        this.tcpServer.setTcpState(TCPServer.LISTENNG_STATE);
    }

    @Override
    public void close() {
        System.out.println("TCP连接断开");
        this.tcpServer.setTcpState(TCPServer.CLOSING_STATE);
    }
}
