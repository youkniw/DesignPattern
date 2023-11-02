package 解释器模式;


public class View {
    private String name;
    private int ID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public View(int ID, String name) {
        this.name = name;
        this.ID = ID;
    }
}
