package 职责链;


public class ValidationFilter extends DataFilter {
    public void filter() {
        System.out.println("数据校验过滤器");
    }
}
