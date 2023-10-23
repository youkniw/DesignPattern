package 中介者模式;

public class TCsubSystem extends SubSystem {

    public TCsubSystem(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void getMessage(String msg) {
        System.out.println("旅行社子系统" + name + "获取的信息是:" + msg);
    }

}
