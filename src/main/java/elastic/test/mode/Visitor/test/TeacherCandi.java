package elastic.test.mode.Visitor.test;

public class TeacherCandi extends AbstractCandi{

	private int num; //论文数
	private double feedback; //反馈分数
	
	public TeacherCandi(int num, double feedback) {
		super();
		this.num = num;
		this.feedback = feedback;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getFeedback() {
		return feedback;
	}

	public void setFeedback(double feedback) {
		this.feedback = feedback;
	}

	@Override
	public void accept(AwardVisitor visitor) {
		visitor.visit(this);
	}

}
