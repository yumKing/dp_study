package elastic.test.elasticsearch.mode.Visitor.test;

public class ExcVisitor extends AwardVisitor{

	@Override
	public void visit(StudentCandi stu) {
		System.out.println("学生优秀奖");
	}

	@Override
	public void visit(TeacherCandi teacher) {
		System.out.println("老师优秀奖");
	}

}
