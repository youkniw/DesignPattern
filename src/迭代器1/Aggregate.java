package 迭代器1;


public interface Aggregate {
    void addItem(String item);

    void removeItem(String item);

    Iterator getIterator();
}
