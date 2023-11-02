package 单例模式.three;



public class loDHClient {
    public static void main(String[] args) {
    System.out.println("使用loDH进行性能测试");
    //创建对象
    Singleton user1 = Singleton.getInstance();
    Singleton user2 = Singleton.getInstance();
    System.out.println("测试结果为");
    //判断两个对象是否相同
    if (user1 == user2) {
        System.out.println("user1 与 user2 是相同的虚拟用户");
    } else {
        System.out.println("user1 与 user2 是两个不同的虚拟用户");
    }
}
}
