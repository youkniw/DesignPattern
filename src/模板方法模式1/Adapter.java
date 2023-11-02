package 模板方法模式1;


public class Adapter {
    private ClassificationAlgorithm classificationAlgorithm;

    public Adapter(ClassificationAlgorithm classificationAlgorithm) {
        this.classificationAlgorithm = classificationAlgorithm;
    }

    public void Classify() {
        classificationAlgorithm.Classify();
    }
}
