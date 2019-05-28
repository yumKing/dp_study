package elastic.test.mode.bridge.test;

public abstract class Image {

	protected OS os;
	
	public void setOS(OS os) {
		this.os = os;
	}
	
	public abstract void display();
}
