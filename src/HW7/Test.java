package HW7;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Shape shape = null;
        Scanner scanner = new Scanner(System.in);
        String shapeName = "";
        while (true) {
            // 接收输入的水果名
            shapeName = scanner.next();
            // 如果为“exit”程序退出
            if (shapeName.equals("exit"))
                break;
            try {
                // 使用简单工厂创建水果对象
                shape = ShapeFactory.createShapeByName(shapeName);
                System.out.println(shape);
                // 调用水果对象的方法
                shape.draw();
                shape.erase();
            } catch (UnsupportedShapeException e) {
                System.out.println(e.toString());
            }
        }
    }
}
