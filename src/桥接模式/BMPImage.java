package 桥接模式;

public class BMPImage extends Image{
	public BMPImage(Filter filter) {
		super(filter);
	}

	@Override
	public void process() {

		filter.addFilter();
	}
	
}
