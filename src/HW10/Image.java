package HW10;

public abstract class Image {
	protected Filter filter;

	public Image(Filter filter) {
		this.filter = filter;
	}

	public abstract void process();
}
