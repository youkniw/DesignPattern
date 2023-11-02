package 迭代器1;

import java.util.List;


public class IteratorImpl implements Iterator {

    private int position;
    private List<String> items;

    public IteratorImpl(List<String> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public String next() {
        String item = items.get(position);
        position++;
        return item;
    }
}
