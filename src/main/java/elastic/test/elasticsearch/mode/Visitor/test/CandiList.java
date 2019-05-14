package elastic.test.elasticsearch.mode.Visitor.test;

import java.util.ArrayList;

public class CandiList {

	private ArrayList<AbstractCandi> list = new ArrayList<AbstractCandi>();
	
	public void accept(AwardVisitor visitor) {
		for(AbstractCandi i : list) {
			i.accept(visitor);
		}
	}
	
	public void addCandi(AbstractCandi candi) {
		list.add(candi);
	}
}
