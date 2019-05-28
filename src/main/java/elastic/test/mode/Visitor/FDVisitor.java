package elastic.test.mode.Visitor;

public class FDVisitor extends AbstractDepartmentVisitor{

	@Override
	public void visit() {
		System.out.println("财务部访问者访问");
	}

	@Override
	public void visit(FullTimeEmployee employee) {
		int workTime = employee.getWorkTime();
		double weekWage = employee.getWeeklyWage();
		if(workTime > 40)
		{
			weekWage = weekWage + (workTime - 40) * 100;
		}
		else if(workTime < 40)
		{
			weekWage = weekWage - (40 - workTime) * 80;
			if(weekWage < 0)
			{
				weekWage = 0;
			}
		}
		System.out.println("正式员工" + employee.getName() + "实际工资为：" + weekWage + "元。");	
	}

	@Override
	public void visit(TemporyEmployee employee) {
		int workTime = employee.getWorkTime();
		double hourWage = employee.getHourWage();
		System.out.println("临时工" + employee.getName() + "实际工资为：" + workTime * hourWage + "元。");
	}


}
