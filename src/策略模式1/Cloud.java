package 策略模式1;


public class Cloud {
    private CopyInterface copy;

    public Cloud(CopyInterface copy) {
        this.copy = copy;
    }

    public void setCopy(CopyInterface copy) {
        this.copy = copy;
    }

    public void Copy() {
        copy.Copy();
    }
}
