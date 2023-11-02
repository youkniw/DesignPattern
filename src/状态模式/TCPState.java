package 状态模式;


public abstract class TCPState {
    protected TCPServer tcpServer;

    public void setTcpServer(TCPServer tcpServer) {
        this.tcpServer = tcpServer;
    }

    //TCP建立
    public abstract void open();

    //TCP监听
    public abstract void listen();

    //TCP关闭
    public abstract void close();
}
