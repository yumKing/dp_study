package elastic.test.elasticsearch.mode.Observe;

import java.util.ArrayList;

public abstract class AllyControlCenter {

	protected String allyName;
	
	//观察者集合
	protected ArrayList<Observer> players = new ArrayList<Observer>();
	
	public String getAllyName() {
		return allyName;
	}

	public void setAllyName(String allyName) {
		this.allyName = allyName;
	}

	//注册方法，增加观察者
	public void join(Observer observer) {
		System.out.println(observer.getName() + "加入" + this.allyName + "战队！");
		players.add(observer);
	}
	
	//注销方法
	public void deattach(Observer observer) {
		System.out.println(observer.getName() + "退出" + this.allyName + "战队！");
		players.remove(observer);
	}
	
	//通知方法
	public abstract void notice(String name);
}
