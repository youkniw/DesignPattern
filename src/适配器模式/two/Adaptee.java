package 适配器模式.two;

public class Adaptee {


        String encodeAPI(String password) {
            return password.toUpperCase();
        }

}
