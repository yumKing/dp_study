package elastic.test.mode.Observe;

public interface Observer {

	public void setName(String name);
	public String getName();
	//声明支援盟友方法
	public void help();
	//声明遭受攻击方法
	public void beAttacked(AllyControlCenter ac);
}
