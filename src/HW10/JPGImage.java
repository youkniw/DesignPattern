package HW10;

public class JPGImage extends Image {
	public JPGImage(Filter filter) {
		super(filter);
	}

	@Override
	public void process() {
		// TODO Auto-generated method stub
		filter.addFilter();
	}
}
