package HW12;

public class Test {
	public static void main(String[] args) {
		StringDisplay  stringDisplay=new StringDisplay("tjunb");
		Display t1=new HeadBorder(stringDisplay,"1");
		Display t2=new TailBorder(stringDisplay,"1");
		Display t3=new HeadBorder(
									new TailBorder(
														new TailBorder(stringDisplay,"1"),"2"),"3");
		t1.show();
		t2.show();
		t3.show();
	}
}
