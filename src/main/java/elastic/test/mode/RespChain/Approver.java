package elastic.test.mode.RespChain;

public abstract class Approver {
	protected Approver successor;
	protected String name;//审批者姓名
	
	public Approver(String name) {
		this.name = name;
	}
	
	public void setHandler(Approver successor) {
		this.successor = successor;
	}
	
	public abstract void processRequest(PurchaseRequest request);
}
