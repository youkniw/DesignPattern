package HW5.three;

//Initialization on Demand Holder
public class Singleton {
    private Singleton() {
        System.out.println("生成一个虚拟用户");
    }

    private static class HolderClass {

        private final static Singleton instance = new Singleton();

    }

    public static Singleton getInstance() {
        return HolderClass.instance;
    }


}
