package HW1;

import java.util.ArrayList;
import java.util.List;

public class PageIterator implements Iterator {
    private  int index;
    private  Page page;

    public PageIterator(Page page) {
        this.page = page;
        this.index=0;
    }

    @Override
    public boolean hasNext() {
        if(index<page.length()) {
           return true;
        }
        else {
            return false;
        }

    }
    @Override
    public Object next() {

        List<String> words = new ArrayList< >() ;

        while(words.size()<3){
            Word word=page.getWords(index);
            words.add(word.getWord());
            index++;
            if(index==page.length()){
                break;
            }
        }

        return words;
    }
}
