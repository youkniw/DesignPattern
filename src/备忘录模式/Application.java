package 备忘录模式;


public class Application {
    private Note note;


    public APPMemento saveState() {
        System.out.println("已保存当前状态：" + this.note.getMsg());
        return new APPMemento(new Note(this.note.getMsg()));
    }

    public void recoverState(Memento memento) {
        APPMemento appMemento = (APPMemento) memento;
//        System.out.println(appMemento.getNote());
        setNote(appMemento.getNote());
    }


    public Application(Note note) {
        this.note = note;
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    private class APPMemento implements Memento {
        private Note note;

        public APPMemento(Note note) {
            this.note = note;
        }

        public Note getNote() {
            return note;
        }

        public void setNote(Note note) {
            this.note = note;
        }
    }
}
