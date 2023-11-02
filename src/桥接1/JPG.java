package 桥接1;


public class JPG extends Image {
    public JPG(Filter filter, String name) {
        super(filter, name);
    }

    @Override
    public void beauty() {
        filter.beauty(name);
    }
}
