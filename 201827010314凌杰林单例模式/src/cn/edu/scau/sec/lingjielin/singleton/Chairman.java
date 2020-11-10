package cn.edu.scau.sec.lingjielin.singleton;

public class Chairman {
	
	public static volatile Chairman chairman;
	private String name;
	
	private Chairman(String name) {
		this.name = name;
	}
	
	public static Chairman getInstance(String name) {
		if (chairman == null) {
			synchronized (Chairman.class) {
				if (chairman == null) {
					chairman = new Chairman(name);
				}				
			}
		}
		return chairman;
	}
	
	public static Chairman getChairman() {
		return chairman;
	}
	
	public static void setChairman(Chairman chairman) {
		Chairman.chairman = chairman;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
