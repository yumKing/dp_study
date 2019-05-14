package elastic.test.elasticsearch.mode.Memento;

/**
 * 	中国象棋，悔棋操作,保留多份备忘录
 * 
 * 备忘录模式
 * @author jinyang
 *
 */
public class Client {

	public static void main(String args[]) {
		MementoCaretaker mc = new MementoCaretaker();
		Chessman chess = new Chessman("车",1,1,mc);
		play(chess,"车",4,1);
		play(chess,"马",2,7);
		play(chess,"兵",1,8);
		play(chess,"相",6,6);
		
		System.out.println("******悔棋******");	
		chess.undo(); //悔棋
		display(chess);
		chess.undo(); //悔棋
		display(chess);
		chess.undo(); //悔棋
		display(chess);
		chess.redo(); //想了下，这步没问题，回撤销把
		display(chess);
		chess.redo(); //想了下，这步没问题，回撤销把
		display(chess);

	}
	
	public static void play(Chessman chess, String label, int x, int y) {
		if(x != 0) {
			chess.setX(x);	
		}
		if(y != 0) {
			chess.setY(y);
		}
		if(label != null) {
			chess.setLabel(label);
		}
		display(chess);
		chess.save(); 
	}
	
	public static void display(Chessman chess) {
		System.out.println("棋子" + chess.getLabel() + "当前位置为：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");
	}
}
