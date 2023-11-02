package 装饰模式1;



public abstract class Garnish extends Table {
    private Table table;

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Garnish(Table table) {
        this.table = table;
    }

}
