package 单例模式.one;

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton() {
        System.out.println("生成一个虚拟用户");
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
