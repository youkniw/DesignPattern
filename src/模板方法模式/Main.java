package 模板方法模式;

public class Main {
    public static void main(String[] args) {
        AbstractClass a1 = new Decision_Tree_Class();
        AbstractClass b1 = new KNN_Class();
        AbstractClass c1 = new Naive_Bayes_Class();
        a1.five();
        b1.five();
        c1.five();

    }
}
