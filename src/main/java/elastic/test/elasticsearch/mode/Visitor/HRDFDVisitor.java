package elastic.test.elasticsearch.mode.Visitor;

public class HRDFDVisitor extends AbstractDepartmentVisitor{

	@Override
	public void visit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(FullTimeEmployee employee) {
		
		int workTime = employee.getWorkTime();
		System.out.println("正式员工" + employee.getName() + "实际工作时间为：" + workTime + "小时。");
		
		double weekWage = employee.getWeeklyWage();
		if(workTime > 40)
		{
			System.out.println("正式员工" + employee.getName() + "加班时间为：" + (workTime - 40) + "小时。");
			weekWage = weekWage + (workTime - 40) * 100;
		}
		else if(workTime < 40)
		{
			System.out.println("正式员工" + employee.getName() + "请假时间为：" + (40 - workTime) + "小时。");
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
		System.out.println("临时工" + employee.getName() + "实际工作时间为：" + workTime + "小时。");
		double hourWage = employee.getHourWage();
		System.out.println("临时工" + employee.getName() + "实际工资为：" + workTime * hourWage + "元。");
	}
	
}
