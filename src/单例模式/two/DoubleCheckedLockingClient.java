package 单例模式.two;

//双重检测锁客户端测试类
public class DoubleCheckedLockingClient {
    public static void main(String[] args) {
        System.out.println("使用双重检测锁进行性能测试");
        //创建对象
        LazySingleton user1 = LazySingleton.getInstance();
        LazySingleton user2 = LazySingleton.getInstance();
        System.out.println("测试结果为");
        //判断两个对象是否相同
        if (user1 == user2) {
            System.out.println("user1 与 user2 是相同的虚拟用户");
        } else {
            System.out.println("user1 与 user2 是两个不同的虚拟用户");
        }
    }
}