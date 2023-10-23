package 访问者模式;

import java.util.ArrayList;
import java.util.List;

public class Code {
    private int lines;
    private List<ClassExample> classList = new ArrayList<ClassExample>();

    public int getLines() {
        return lines;
    }

    public List<ClassExample> getClassList() {
        return classList;
    }

    public void addClass(ClassExample classExample) {
        classList.add(classExample);
        lines += classExample.getLines();
    }

    public void accept(Analyzer analyzer) {
        analyzer.analyze(this);
    }
}
