package 装饰者模式;

public class HeadBorder extends Border{
	private String str;
	public HeadBorder(Display display,String str) {
		super(display);
		this.str=str;
	}
	public String getText() {
		return str+display.getText();
	}
}
