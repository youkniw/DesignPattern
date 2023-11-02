package 享元模式;


public class Normal extends Account {

    @Override
    public String getPermission() {
        return "身份：平民用户";
    }
}
