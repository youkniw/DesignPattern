package 备忘录模式;

public class Test {
    public static void main(String[] args) {
        Note note = new Note();
        note.setMsg("11");
        Application application = new Application(note);
        APPStateCaretaker appStateCaretaker = new APPStateCaretaker();
        appStateCaretaker.saveMemento(application.saveState());
        application.getNote().setMsg("22");
        appStateCaretaker.saveMemento(application.saveState());
        application.getNote().setMsg("33");
        application.recoverState(appStateCaretaker.getBack());
        System.out.println(application.getNote().getMsg());
        application.recoverState(appStateCaretaker.getBack());
        System.out.println(application.getNote().getMsg());
        application.recoverState(appStateCaretaker.getFront());
        System.out.println(application.getNote().getMsg());
        application.recoverState(appStateCaretaker.getFront());
        System.out.println(application.getNote().getMsg());
    }
}

