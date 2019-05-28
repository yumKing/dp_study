package elastic.test.mode.Observe;

public class Player implements Observer{

	private String name;
	
	public Player(String name) {
		this.name = name;
	}
	
	//支援盟友方法的实现
	@Override
	public void help() {
		System.out.println("坚持住，" + this.name + "来救你！");
	}

	//受到攻击方法的实现
	@Override
	public void beAttacked(AllyControlCenter ac) {
		System.out.println(this.name + "被攻击！");
		ac.notice(this.name);
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

}
