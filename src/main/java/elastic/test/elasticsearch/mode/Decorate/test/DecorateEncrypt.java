package elastic.test.elasticsearch.mode.Decorate.test;

public abstract class DecorateEncrypt implements IEncrypt{

	private IEncrypt it;
	
	public DecorateEncrypt(IEncrypt it) {
		this.it = it;
	}
	
	public abstract String addEncrypt(String en);
	
	@Override
	public String encrypt() {
		String encrypt_0 = it.encrypt();
		
		return addEncrypt(encrypt_0);
	}

}
