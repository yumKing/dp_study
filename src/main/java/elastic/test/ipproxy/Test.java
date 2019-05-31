package elastic.test.ipproxy;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

public class Test {

	public static void main(String[] args) {
//		String url = "prxyaddress";
//		IPool pool = new DefaultIPool(url, new ParseMode3());
//		pool.run();
		String json = "{\"result\":0,\"message\":null,\"data\":{\"offerDetailOrgCount\":0,\"maxAmount\":65162.00,\"currentLoanOrgCount\":1,\"lastQueryDate\":null,\"lastMonthQueryCount\":null,\"lastLoanDate\":\"2018-06-09\",\"m12LoanOrgCount\":1,\"minAmount\":65162.00,\"currentLoanCount\":1,\"lastWeekQueryCount\":null,\"m6LoanCount\":null,\"querySerialNumber\":\"571758231670628719\",\"m6LoanOrgCount\":null,\"m12LoanCount\":1,\"lastContractDate\":\"2021-05-09\"},\"extendData\":null}";
		
		IParse parse = new ParseMode1();
		System.out.println(parse.getJsonText(json, "$data"));
	}
}
