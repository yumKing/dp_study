package elastic.test.mode.Prototype;

public class MyObject implements IProtoType{

	private String name;
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public IProtoType myclone() {
		MyObject mt = new MyObject();
		mt.setName(this.name);
		return mt;
	}

}
