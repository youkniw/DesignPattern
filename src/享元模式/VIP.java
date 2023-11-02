package 享元模式;


public class VIP extends Account {
    @Override
    public String getPermission() {
        return "身份：尊贵用户";
    }

}
