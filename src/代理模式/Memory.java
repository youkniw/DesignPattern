package 代理模式;

import java.util.ArrayList;
import java.util.List;


public class Memory {
    private List<String> list;
    public Memory(List list) {
        this.list = list;
    }




    public void getItem(String item) {
        if (list.contains(item)) {
            System.out.println("从内存中获取到" + item);
        }
    }
}
