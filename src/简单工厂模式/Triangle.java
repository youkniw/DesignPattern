package 简单工厂模式;

public class Triangle implements Shape {
    public Triangle(){
        System.out.println("三角形创建成功");
    }
    @Override
    public String toString() {
        return "三角形";
    }
    @Override
    public void draw() {
        System.out.println("三角形绘制");
    }

    @Override
    public void erase() {
        System.out.println("三角形消除");
    }
}
