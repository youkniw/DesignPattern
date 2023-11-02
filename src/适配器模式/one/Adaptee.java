package 适配器模式.one;

public class Adaptee {

    String encodeAPI(String password) {
        return password.toUpperCase();
    }
}
