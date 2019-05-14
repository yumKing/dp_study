package elastic.test.elasticsearch.mode.Visitor.test;

public class Client {
	public static void main(String[] args) {
		CandiList cl = new CandiList();
		
		StudentCandi sc1 = new StudentCandi(80.0, 10);
		StudentCandi sc2 = new StudentCandi(80.0, 10);
		StudentCandi sc3 = new StudentCandi(80.0, 10);
		TeacherCandi tc1 = new TeacherCandi(5, 80.2);
		TeacherCandi tc2 = new TeacherCandi(5, 80.2);
		TeacherCandi tc3 = new TeacherCandi(5, 80.2);
		cl.addCandi(sc1);
		cl.addCandi(sc2);
		cl.addCandi(sc3);
		cl.addCandi(tc1);
		cl.addCandi(tc2);
		cl.addCandi(tc3);
		
//		AwardVisitor sv = new SciVisitor();
		AwardVisitor sv = new ExcVisitor();
		cl.accept(sv);
	}
}
