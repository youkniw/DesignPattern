package HW10;

public class Test {
	 public static void main(String[] args) {
		 Filter filter=new CutoutFilter();
		 Image image=new JPGImage(filter);
		 image.process();
	 }
}
