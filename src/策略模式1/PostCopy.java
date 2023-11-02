package 策略模式1;


public class PostCopy implements CopyInterface {

    @Override
    public void Copy() {
        System.out.println("使用后拷贝算法进行数据拷贝");
    }
}
