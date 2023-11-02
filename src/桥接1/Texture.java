package 桥接1;


public class Texture implements Filter {
    @Override
    public void beauty(String name) {
        System.out.println("使用纹理滤镜处理图片:" + name);
    }
}
