package 模板方法模式1;


public class Test {
    public static void main(String[] args) {
        Classification1 classification1 = new Classification1();
        classification1.Classification();
        System.out.println("==================");
        Classification2 classification2 = new Classification2();
        classification2.Classification();
        System.out.println("==================");
        Classification3 classification3 = new Classification3();
        classification3.Classification();
    }
}
