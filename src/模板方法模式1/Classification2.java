package 模板方法模式1;


public class Classification2 extends ClassificationTemplate {

    @Override
    protected void ClassifyData() {
        Adapter adapter = new Adapter(new DecisionTree());
        adapter.Classify();
    }
}
