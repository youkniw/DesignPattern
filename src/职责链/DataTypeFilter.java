package 职责链;


public class DataTypeFilter extends DataFilter {
    public void filter() {
        System.out.println("数据类型转换过滤器");
        this.successor.filter();
    }
}

