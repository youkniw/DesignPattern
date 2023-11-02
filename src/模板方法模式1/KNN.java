package 模板方法模式1;


public class KNN implements ClassificationAlgorithm {

    @Override
    public void Classify() {
        System.out.println("使用K最邻近分类算法进行分类");
    }
}
