package elastic.test.client.bytesAdapter;

public interface BytesAdapter {

	public byte[] toBytes(Object value);
	
	public Object toObject(byte[] bytes);

	public Object toObject(byte[] bytes, int offset, final int length);
	
}
