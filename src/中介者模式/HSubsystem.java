package 中介者模式;

public class HSubsystem extends SubSystem{

    public HSubsystem(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void getMessage(String msg) {
        System.out.println("宾馆子系统" + name + "获取的信息是:" + msg);
    }
}
