package cn.edu.scau.sec.lingjielin.singleton;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Marshall {
	
	private static volatile Set<Marshall> marshallSet = new HashSet<Marshall>();
	private static final int MARSHALL_QUENTITY = 10;
	final static String[] NAME = {"朱德","彭德怀","林彪","刘伯承","贺龙","陈毅","罗荣桓","徐向前","聂荣臻","叶剑英"};
	private String name;
	
	private Marshall(String name) {
		this.name = name;
	}
	 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Marshall other = (Marshall) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public static Set<Marshall> getMarshallSet() {
		return marshallSet;
	}

	public static void setMarshallSet(Set<Marshall> marshallSet) {
		Marshall.marshallSet = marshallSet;
	}

	public static Set<Marshall> getInstance(String name) {
			if (marshallSet.size() < MARSHALL_QUENTITY && (Arrays.asList(NAME).contains(name))) {
			Marshall marshall = new Marshall(name);
			marshallSet.add(marshall);
			}	
		return marshallSet;
	}
}
