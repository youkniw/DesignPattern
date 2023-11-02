package 享元模式;


public abstract class Account {
    public abstract String getPermission();

    public void display(String name) {
        System.out.println(name + "用户的权限是：" + getPermission());
    }
}
