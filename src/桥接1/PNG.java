package 桥接1;


public class PNG extends Image {
    public PNG(Filter filter, String name) {
        super(filter, name);
    }

    @Override
    public void beauty() {
        filter.beauty(name);
    }
}
