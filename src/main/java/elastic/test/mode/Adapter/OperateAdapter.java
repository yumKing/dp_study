package elastic.test.mode.Adapter;

public class OperateAdapter implements ScoreOperation{

	private QuickSort qs ;
	private BinarySearch bs;
	
	public OperateAdapter() {
		qs = new QuickSort();
		bs = new BinarySearch();
	}
	
	@Override
	public int[] sort(int[] array) {
		return qs.quickSort(array);
	}

	@Override
	public int search(int[] array, int key) {
		return bs.binarySearch(array, key);
	}

}
