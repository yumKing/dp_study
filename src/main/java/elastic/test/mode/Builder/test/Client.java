package elastic.test.mode.Builder.test;

public class Client {

	public static void main(String[] args) {
//		DisplayBuilder db = new FullModeBuilder();
//		DisplayBuilder db = new SimplifyBuilder();
		DisplayBuilder db = new MemoryBuilder();
		
		DisplayDirector dd = new DisplayDirector();
		Display dis = dd.construct(db);
		System.out.println(dis.getMainDialog());
		System.out.println(dis.getPlaylist());
		System.out.println(dis.getViewMenu());
		System.out.println(dis.getControlStrip());
	}
}
