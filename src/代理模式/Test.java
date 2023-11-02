package 代理模式;

import java.util.ArrayList;
import java.util.List;


public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("元素1");
        list.add("元素2");
        list.add("元素3");
        Memory memory = new Memory(list);
        ProxyMemory proxyMemoey = new ProxyMemory(memory);
        proxyMemoey.getItem("元素1");
        proxyMemoey.getItem("元素2");
        proxyMemoey.getItem("元素1");
    }

}
