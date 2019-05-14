package elastic.test.elasticsearch.mode.Memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MementoCaretaker {

	private Stack<ChessmanMemento> stacks = new Stack<ChessmanMemento>();
	private Stack<ChessmanMemento> restacks = new Stack<ChessmanMemento>();
	
	public ChessmanMemento getMemento() {
		if(stacks.empty()) {
			return null;
		}
		return stacks.pop();
	}

	public void setMemento(ChessmanMemento memento) {
		if(stacks.size() >= 10) {
			stacks.remove(10);
		}
		stacks.push(memento);
	}
	
	public void addMemento(ChessmanMemento memento) {
		restacks.push(memento);
	}
	public ChessmanMemento removeMemento() {
		return restacks.pop();
	}
	
}
