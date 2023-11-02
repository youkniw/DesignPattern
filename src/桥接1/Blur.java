package 桥接1;


public class Blur implements Filter{
    @Override
    public void beauty(String name) {
        System.out.println("使用模糊滤镜处理图片:" + name);
    }
}
