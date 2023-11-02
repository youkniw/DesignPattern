package 模板方法模式1;

public class Classification3 extends ClassificationTemplate {

    @Override
    protected void ClassifyData() {
        Adapter adapter = new Adapter(new KNN());
        adapter.Classify();
    }
}
