package 桥接1;


public class Test {

    public static void main(String[] args) {
        JPG jpg = new JPG(new Sharpen(), "风景.jpg");
        jpg.beauty();
        PNG png = new PNG(new Texture(), "美女.png");
        png.beauty();
        GIF gif = new GIF(new Blur(), "好吃的.gif");
        gif.beauty();
    }
}
