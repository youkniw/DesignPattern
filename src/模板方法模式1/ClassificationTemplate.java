package 模板方法模式1;


public abstract class ClassificationTemplate {
    public final void Classification() {
        readDate();
        TransfromData();
        ClassifyData();
        ShowDate();
    }

    protected void ShowDate() {
        System.out.println("显示数据分类结果");
    }

    protected abstract void ClassifyData();

    protected void TransfromData() {
        System.out.println("转换分类的数据格式");
    }

    protected void readDate() {
        System.out.println("读取要分类的数据");
    }


}
