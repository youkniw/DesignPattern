package 适配器模式.two;



public class Adapter implements Target{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String encodePwd(String password) {
        return adaptee.encodeAPI(password);
    }
}