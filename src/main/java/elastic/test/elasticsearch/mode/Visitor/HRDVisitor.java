package elastic.test.elasticsearch.mode.Visitor;

public class HRDVisitor extends AbstractDepartmentVisitor{

	@Override
	public void visit() {
		System.out.println("人力资源部分访问者访问");
	}

	@Override
	public void visit(FullTimeEmployee employee) {
		//这里就破坏了封装，元素暴露了内部操作
		int workTime = employee.getWorkTime();
		System.out.println("正式员工" + employee.getName() + "实际工作时间为：" + workTime + "小时。");
		if(workTime > 40)
		{
			System.out.println("正式员工" + employee.getName() + "加班时间为：" + (workTime - 40) + "小时。");
		}
		else if(workTime < 40)
		{
			System.out.println("正式员工" + employee.getName() + "请假时间为：" + (40 - workTime) + "小时。");
		}				
	}

	@Override
	public void visit(TemporyEmployee employee) {
		int workTime = employee.getWorkTime();
		System.out.println("临时工" + employee.getName() + "实际工作时间为：" + workTime + "小时。");
	}

}
