package 装饰者模式;

public class StringDisplay extends Display{
	private String str;
	public StringDisplay(String str) {
		this.str=str;
	}
	@Override
	public String getText() {
		return str;
	}
}
