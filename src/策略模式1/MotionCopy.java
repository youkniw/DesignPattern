package 策略模式1;


public class MotionCopy implements CopyInterface {

    @Override
    public void Copy() {
        System.out.println("使用CR/CT-Motion拷贝算法进行数据拷贝");
    }
}
