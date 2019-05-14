package elastic.test.elasticsearch.mode.Decorate.test;

public class ComplexEncrypt extends DecorateEncrypt{

	public ComplexEncrypt(IEncrypt it) {
		super(it);
	}

	@Override
	public String addEncrypt(String en) {
		System.out.println("复杂加密算法");
		return "complex:" + en + "AND";
	}

}
