package 桥接模式;

public abstract class Image {
	protected Filter filter;

	public Image(Filter filter) {
		this.filter = filter;
	}

	public abstract void process();
}
