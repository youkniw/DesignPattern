package HW10;

public class BMPImage extends Image{
	public BMPImage(Filter filter) {
		super(filter);
	}

	@Override
	public void process() {
		// TODO Auto-generated method stub
		filter.addFilter();
	}
	
}
