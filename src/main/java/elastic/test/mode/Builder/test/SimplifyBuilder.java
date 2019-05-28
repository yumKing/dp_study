package elastic.test.mode.Builder.test;

public class SimplifyBuilder extends DisplayBuilder{

	@Override
	public void buildViewMenu() {
		//TODO: 因为是精简模式，所以不需要建造
	}

	@Override
	public void buildPlaylist() {
		//TODO: 因为是精简模式，所以不需要建造
	}

	@Override
	public void buildMainDialog() {
		dis.setMainDialog("精简模式--主界面");
	}

	@Override
	public void buildControlStrip() {
		dis.setControlStrip("精简模式--控制条");
	}

	@Override
	public boolean isViewMenu() {
		return false;
	}

	@Override
	public boolean isPlaylist() {
		return false;
	}

}
