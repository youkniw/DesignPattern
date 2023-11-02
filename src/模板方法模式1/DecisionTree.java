package 模板方法模式1;


public class DecisionTree implements  ClassificationAlgorithm{

    @Override
    public void Classify() {
        System.out.println("使用决策树分类算法进行分类");
    }
}
