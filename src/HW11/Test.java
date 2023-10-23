package HW11;

public class Test {
	public static void main(String[] args) {
		Member li = new Member("li");
		Member zhang = new Member("zhang");
		Member liu = new Member("liu");
		Member wang = new Member("wang");
		Group exo = new Group("exo");
		Group she = new Group("she");
		
		exo.add(wang);
		exo.add(li);
		she.add(zhang);
		exo.add(she);
		
		liu.getShare("inf1");
		
		exo.getShare("inf2");
		
		liu.share(she, "inf3");
	}
}