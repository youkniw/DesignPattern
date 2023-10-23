package HW12;

public class TailBorder extends Border{
	private String str;
	public TailBorder(Display display,String str) {
		super(display);
		this.str=str;
	}
	public String getText() {
		return display.getText()+str;
	}
}
