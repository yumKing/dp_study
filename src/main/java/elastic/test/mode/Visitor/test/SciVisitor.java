package elastic.test.mode.Visitor.test;

public class SciVisitor extends AwardVisitor{

	@Override
	public void visit(StudentCandi stu) {
		System.out.println("学生科研奖");
	}

	@Override
	public void visit(TeacherCandi teacher) {
		System.out.println("老师科研奖");
	}

}
