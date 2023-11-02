package 迭代器模式;

import java.util.ArrayList;
import java.util.List;


public class Page implements Aggregate{
    List<Word> words = new ArrayList<>();
    public Word getWords(int index) {
         return words.get(index);
    }
    public void append(Word word) {
            words.add(word);
    }
    public int length() {
        return words.size();
    }


    @Override
    public Iterator iterator() {
        return new PageIterator(this);
    }
}
