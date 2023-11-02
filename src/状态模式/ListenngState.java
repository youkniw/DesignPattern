package 状态模式;


public class ListenngState extends TCPState{

    @Override
    public void open() {

    }

    @Override
    public void listen() {

    }

    @Override
    public void close() {
        System.out.println("TCP连接断开");
        this.tcpServer.setTcpState(TCPServer.CLOSING_STATE);
    }
}
