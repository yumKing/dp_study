package elastic.test.mode.Visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeListStruct {

	private ArrayList<AbstractEmployee> list = new ArrayList<AbstractEmployee>();
	
	public void accept(AbstractDepartmentVisitor visitor) {
		Iterator<AbstractEmployee> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			((AbstractEmployee)iterator.next()).accept(visitor);
		}
	}
	
	public void addEmployee(AbstractEmployee employee) {
		list.add(employee);
	}
	
	public void delEmployee(AbstractEmployee employee) {
		list.remove(employee);
	}
}
