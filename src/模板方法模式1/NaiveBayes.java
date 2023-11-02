package 模板方法模式1;


public class NaiveBayes implements ClassificationAlgorithm {


    @Override
    public void Classify() {
        System.out.println("使用贝叶斯分类算法进行分类");
    }
}
