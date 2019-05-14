package elastic.test.elasticsearch.mode.Adapter;

public interface ScoreOperation {

	public int[] sort(int[] array);
	
	public int search(int[] array, int key);
}
