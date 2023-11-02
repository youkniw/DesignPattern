package 策略模式1;


public class Test {
    public static void main(String[] args) {
        Cloud cloud = new Cloud(new PreCopy());
        cloud.Copy();

        System.out.println("==================");
        cloud.setCopy(new PostCopy());
        cloud.Copy();

        System.out.println("==================");
        cloud.setCopy(new MotionCopy());
        cloud.Copy();
    }
}
