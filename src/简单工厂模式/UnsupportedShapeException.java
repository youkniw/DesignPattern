package 简单工厂模式;

public class UnsupportedShapeException extends Exception {
    @Override
    public String toString() {
        return "没有该图形";
    }
}

