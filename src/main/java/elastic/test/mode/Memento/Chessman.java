package elastic.test.mode.Memento;

public class Chessman {
	
	private String label;
	private int x;
	private int y;
	private MementoCaretaker taker;
	
	public Chessman(String label, int x, int y, MementoCaretaker taker) {
		this.label = label;
		this.x = x;
		this.y = y;
		this.taker = taker;
	}
	
	//保存状态
	public void save() {
		this.taker.setMemento(new ChessmanMemento(this.label, this.x, this.y));
	}
	
	//撤销
	public void undo() {
		ChessmanMemento memento = taker.getMemento();
		if(memento == null) {
			return ;
		}
		this.label = memento.getLabel();
		this.x = memento.getX();
		this.y = memento.getY();
		taker.addMemento(memento);
	}
	
	//取消撤销
	public void redo() {
		ChessmanMemento memento = taker.removeMemento();
		if(memento == null) {
			return ;
		}
		this.label = memento.getLabel();
		this.x = memento.getX();
		this.y = memento.getY();
		taker.setMemento(memento);
	}
	
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}
