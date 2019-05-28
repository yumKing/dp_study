package elastic.test.mode.bridge;

public abstract class Brush {

	protected Color color;
	
//	public Brush(Color color) {
//		this.color = color;
//	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract void draw();
}
