package 中介者模式;


public class ASubsystem extends SubSystem {
    public ASubsystem(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void getMessage(String msg) {
        System.out.println("机场子系统" + name + "获取的信息是:" + msg);
    }
}
