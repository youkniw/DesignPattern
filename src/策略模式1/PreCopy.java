package 策略模式1;


public class PreCopy implements CopyInterface {

    @Override
    public void Copy() {
        System.out.println("使用预拷贝算法进行数据拷贝");
    }
}
