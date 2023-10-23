package 职责链;


public abstract class DataFilter {
    protected DataFilter successor;

    public void setSuccessor(DataFilter successor) {
        this.successor = successor;
    }

    public abstract void filter();

}
