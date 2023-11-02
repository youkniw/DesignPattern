package 装饰者模式;

public abstract class Display {
	public abstract String getText();
	public void show(){
		System.out.println(getText());
	}
}
