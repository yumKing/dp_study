package elastic.test.client.bytesAdapter;

import elastic.test.client.enums.DataType;
import elastic.test.client.utils.URLUtil;

public class UrlBA implements BytesAdapter {

	@Override
	public byte[] toBytes(Object value) {
		String url = (String) value;
		return DataType.STRING.toBytes(URLUtil.reverseUrl(url));
	}

	@Override
	public Object toObject(byte[] bytes) {
		String r = (String) DataType.STRING.toObject(bytes);
		return URLUtil.unreverseUrl(r);
	}

	@Override
	public Object toObject(byte[] bytes, int offset, int length) {
		String r = (String) DataType.STRING.toObject(bytes, offset, length);
		return URLUtil.unreverseUrl(r);
	}


}
