package HW10;

public class GIFImage extends Image{
	public GIFImage(Filter filter) {
		super(filter);
	}

	@Override
	public void process() {
		// TODO Auto-generated method stub
		filter.addFilter();
	}
}
