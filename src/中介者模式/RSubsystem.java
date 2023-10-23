package 中介者模式;


public class RSubsystem extends SubSystem {
    public RSubsystem(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void getMessage(String msg) {
        System.out.println("餐厅子系统" + name + "获取的信息是:" + msg);
    }
}
