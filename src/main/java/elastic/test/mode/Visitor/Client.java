package elastic.test.mode.Visitor;

/* 访问者模式
 * 
 * 	需求说明
 * Sunny软件公司欲为某银行开发一套OA系统，在该OA系统中包含一个员工信息管理子系统，
 *	 该银行员工包括正式员工和临时工，每周人力资源部和财务部等部门需要对员工数据进行汇总，汇总数据包括员工工作时间、员工工资等。该公司基本制度如下：

       (1) 正式员工(Full time  Employee)每周工作时间为40小时，不同级别、不同部门的员工每周基本工资不同；
如果超过40小时，超出部分按照100元/小时作为加班费；
如果少于40小时，所缺时间按照请假处理，请假所扣工资以80元/小时计算，直到基本工资扣除到零为止。
除了记录实际工作时间外，人力资源部需记录加班时长或请假时长，作为员工平时表现的一项依据。

       (2) 临时工(Part time  Employee)每周工作时间不固定，基本工资按小时计算，不同岗位的临时工小时工资不同。
人力资源部只需记录实际工作时间。

       人力资源部和财务部工作人员可以根据各自的需要对员工数据进行汇总处理，
人力资源部负责汇总每周员工工作时间，而财务部负责计算每周员工工资
 * 
 */
public class Client {

	public static void main(String[] args) {
		EmployeeListStruct list = new EmployeeListStruct();
		AbstractEmployee fte1,fte2,fte3,pte1,pte2;
 
		fte1 = new FullTimeEmployee("张无忌",3200.00,45);
		fte2 = new FullTimeEmployee("杨过",2000.00,40);
		fte3 = new FullTimeEmployee("段誉",2400.00,38);
		pte1 = new TemporyEmployee("洪七公",80.00,20);
		pte2 = new TemporyEmployee("郭靖",60.00,18);
 
		list.addEmployee(fte1);
		list.addEmployee(fte2);
		list.addEmployee(fte3);
		list.addEmployee(pte1);
		list.addEmployee(pte2);
 
		AbstractDepartmentVisitor dep;
		dep = new HRDFDVisitor();
		list.accept(dep);
	}
}
