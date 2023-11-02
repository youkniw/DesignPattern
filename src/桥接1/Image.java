package 桥接1;


public abstract class Image {
    protected String name;
    protected Filter filter;

    public Image(Filter filter, String name) {
        this.filter = filter;
        this.name = name;
    }

    public abstract void beauty();
}
