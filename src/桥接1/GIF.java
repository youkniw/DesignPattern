package 桥接1;


public class GIF extends Image {
    public GIF(Filter filter, String name) {
        super(filter, name);
    }

    @Override
    public void beauty() {
        filter.beauty(name);
    }
}
