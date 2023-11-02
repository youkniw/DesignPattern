package 组合模式;

public abstract class Entry {
    public abstract void getShare(String inf);

    public void add(Entry entry) throws Exception {
        throw new Exception("Member can't add Member");
    }

    public void share(Entry entry) throws Exception {
        throw new Exception("Group can't share");
    }
}
