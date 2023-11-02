package 桥接1;


public class Sharpen implements Filter{
    @Override
    public void beauty(String name) {
        System.out.println("使用锐化滤镜处理图片:" + name);
    }
}
