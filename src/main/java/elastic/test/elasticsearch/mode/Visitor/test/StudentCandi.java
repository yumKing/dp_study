package elastic.test.elasticsearch.mode.Visitor.test;

public class StudentCandi extends AbstractCandi{

	private double avg; //平均成绩
	private int num;  //论文数
	
	public StudentCandi(double avg, int num) {
		super();
		this.avg = avg;
		this.num = num;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public void accept(AwardVisitor visitor) {
		visitor.visit(this);
	}

}
