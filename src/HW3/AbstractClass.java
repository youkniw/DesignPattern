package HW3;

public  abstract class AbstractClass {
    public  final void  one(){
        System.out.println("读取数据 ");
    }
    public final void two(){
        System.out.println("转换数据格式 ");
    }
    public abstract void three();
    public final void four(){

        System.out.println("显示数据分类结果 ");
    }
    public final void five(){
        one();
        two();
        three();
        four();
    }
}
