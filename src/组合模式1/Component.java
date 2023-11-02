package 组合模式1;

public abstract class Component {
    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void share(Component component);
}
