package elastic.test.elasticsearch.mode.Visitor.test;

public abstract class AwardVisitor {

	//科研奖访问
	public abstract void visit(StudentCandi stu);
	
	//优秀奖访问
	public abstract void visit(TeacherCandi teacher);
}
