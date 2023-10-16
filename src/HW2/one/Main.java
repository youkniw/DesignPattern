package HW2.one;

public class Main {
    public static void main(String[] args) {
            Target encode=new Adapter();
            String result=encode.encodePwd("hello");
            System.out.println(result);
        }


}
