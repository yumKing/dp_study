package elastic.test.mode.Decorate.test;

public class StringEncrypt implements IEncrypt{

	private String plaintext;
	
	public StringEncrypt(String plaintext) {
		this.plaintext = plaintext;
	}
	
	@Override
	public String encrypt() {
//		return "as:" + this.plaintext + ":cp";
		return this.plaintext;
	}

}
