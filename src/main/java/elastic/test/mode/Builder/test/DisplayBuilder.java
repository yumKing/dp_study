package elastic.test.mode.Builder.test;

public abstract class DisplayBuilder {

	protected Display dis = new Display();
	
	public abstract void buildViewMenu();
	public abstract void buildPlaylist();
	public abstract void buildMainDialog();
	public abstract void buildControlStrip();
	
	public Display createDisplay() {
		return dis;
	}
	
	public boolean isViewMenu() {
		return true;
	}
	public boolean isPlaylist() {
		return true;
	}
	public boolean isMainDialog() {
		return true;
	}
	public boolean isControlStrip() {
		return true;
	}
}
