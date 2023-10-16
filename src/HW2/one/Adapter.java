package HW2.one;

public class Adapter extends Adaptee implements Target {

    @Override
    public String encodePwd(String password) {

        return encodeAPI(password);
    }
}
