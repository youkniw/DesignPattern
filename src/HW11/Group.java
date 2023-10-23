package HW11;

import java.util.*;

public class Group extends Entry {
	private String name;
	private ArrayList group = new ArrayList();

	public Group(String name) {
		this.name = name;
	}

	@Override
	public void getShare(String inf) {
		// TODO Auto-generated method stub
		Iterator it = group.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry) it.next();
			entry.getShare(inf);
		}
	}

	@Override
	public void add(Entry entry) {
		// TODO Auto-generated method stub
		group.add(entry);
	}

}
