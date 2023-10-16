package HW1;

public class Main {
    public static void main(String[] args) {
        Page page = new Page();
        page.append(new Word("aaa"));
        page.append(new Word("bbb"));
        page.append(new Word("ccc"));
        page.append(new Word("ddd"));
        page.append(new Word("eee"));
        //page.append(new Word("fff"));
        Iterator it = page.iterator();
        while(it.hasNext()){

            System.out.println(it.next());
        }

    }
}
