package elastic.test.mode.Visitor;

public abstract class AbstractDepartmentVisitor implements DepartmentVistor{

	public abstract void visit(FullTimeEmployee employee);
	
	public abstract void visit(TemporyEmployee employee);
	
	public void visitOtherEmployee() {
		//所有访问者都能访问的元素
	}
}
