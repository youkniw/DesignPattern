package 组合模式;

public class Member extends Entry {
	private String name;

	public Member(String name) {
		this.name = name;
	}

	public void share(Entry entry, String inf) {
		entry.getShare(inf);
	}

	public void getShare(String inf) {
		String name = this.name;
		System.out.println(name + " has got information:" + inf);
	}
}
