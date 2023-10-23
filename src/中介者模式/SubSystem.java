package 中介者模式;


public abstract class SubSystem {
    protected String name;
    protected Mediator mediator;

    public SubSystem(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void contact(String msg) {
        mediator.contact(msg, this);
    }

    public abstract void getMessage(String msg);
}
