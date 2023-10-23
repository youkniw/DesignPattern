package 访问者模式;


public class Analyzer2 implements Analyzer {

    @Override
    public void analyze(Code code) {
        System.out.print("经分析代码中声明的类有：");
        for (ClassExample classExample : code.getClassList()) {
            System.out.print(classExample.getName() + ", ");
        }
        System.out.print("\n");
        for (ClassExample classExample : code.getClassList()) {
            System.out.println(classExample.getName() + "类中定义的方法有：" + classExample.getMethods().keySet());
            System.out.println(classExample.getName() + "类中定义的属性有" + classExample.getVars());
        }
    }
}
