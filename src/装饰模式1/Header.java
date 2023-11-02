package 装饰模式1;


public class Header extends Garnish {
    private String header;

    public Header(Table table, String header) {
        super(table);
        this.header = header;
//        System.out.println(table.content);
        content = header + " " + table.content;
    }


}
