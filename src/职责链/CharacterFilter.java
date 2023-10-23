package 职责链;


public class CharacterFilter extends DataFilter {
    public void filter() {
        System.out.println("字符编码转换过滤器");
        this.successor.filter();
    }
}

