package HW12;

public abstract class Display {
	public abstract String getText();
	public void show(){
		System.out.println(getText());
	}
}
