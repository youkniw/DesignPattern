package HW5.two;

class LazySingleton {
    private volatile static LazySingleton instance = null;

    private LazySingleton() {
        System.out.println("生成一个虚拟用户");
    }

    public static LazySingleton getInstance() {
        //第一重判断
        if (instance == null) {
            //锁定代码块
            synchronized (LazySingleton.class) {
                //第二重判断
                if (instance == null) {
                    instance = new LazySingleton(); //创建单例实例
                }
            }
        }
        return instance;
    }
}