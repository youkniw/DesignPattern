package 访问者模式;


public class Analyzer1 implements Analyzer {

    @Override
    public void analyze(Code code) {
        System.out.println("经分析代码中类的总个数：" + code.getClassList().size());
        for (ClassExample classExample : code.getClassList()) {
            System.out.println(classExample.getName() + "类拥有的属性个数：" + classExample.getVars().size());
            System.out.println(classExample.getName() + "类拥有的方法个数：" + classExample.getMethods().size());
        }
    }
}
