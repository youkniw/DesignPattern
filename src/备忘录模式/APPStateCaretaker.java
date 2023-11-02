package 备忘录模式;

import java.util.Stack;


public class APPStateCaretaker {
    private Stack<Memento> front = new Stack<>();
    private Stack<Memento> back = new Stack<>();

    public Memento getFront() {
        Memento memento = front.pop();
        back.push(memento);
        return memento;
    }

    public Memento getBack() {
        Memento memento = back.pop();
        front.push(memento);
        return memento;
    }

    public void saveMemento(Memento memento) {
        back.push(memento);
//        System.out.println(memento);
    }
}
