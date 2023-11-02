package 适配器模式.two;

public class Client {
    public static void main(String[] args) {
        Target encode=new Adapter(new Adaptee());
        String result=encode.encodePwd("hello");
        System.out.println(result);
    }
}
