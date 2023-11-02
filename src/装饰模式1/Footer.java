package 装饰模式1;

public class Footer extends Garnish {

    private String footer;

    public Footer(Table table, String footer) {
        super(table);
        this.footer = footer;
        content = table.content + " " + footer;
    }

}
