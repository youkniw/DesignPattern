package 中介者模式;


public class TASubsystem extends SubSystem {

    public TASubsystem(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void getMessage(String msg) {
        System.out.println("旅游景点子系统" + name + "获取的信息是:" + msg);
    }
}
