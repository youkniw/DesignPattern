package 简单工厂模式;



public class ShapeFactory {
    static public Shape createShapeByName(String name) throws UnsupportedShapeException {
        name = name.toLowerCase();
        Shape res;
        switch (name){
            case "circle":
                res = new Circle();
                break;
            case "triangle":
                res = new Triangle();
                break;
            case "rectangle":
                res = new Rectangle();
                break;
            default:
                throw new UnsupportedShapeException();
        }
        return res;
    }
}

