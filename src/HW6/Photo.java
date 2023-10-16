package HW6;

import java.io.Serializable;

public class Photo implements Serializable {

    private static final long serialVersionUID = 4455555666L;

    private int size;

    public Photo(int size) {
        super();
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Photo [size=" + size + "]";
    }
}
