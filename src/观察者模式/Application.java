package 观察者模式;

import java.util.ArrayList;
import java.util.List;


public class Application {
    private List<Observer> list = new ArrayList<>();

    public void attach(Observer observer) {
        list.add(observer);
    }

    public void detach(Observer observer) {
        list.remove(observer);
    }

    public void handler(String msg) {
        for (Observer observer : list) {
            observer.handler(msg);
        }
    }
}
