package 适配器模式.one;

public class Adapter extends Adaptee implements Target {

    @Override
    public String encodePwd(String password) {

        return encodeAPI(password);
    }
}
