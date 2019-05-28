package elastic.test.mode.Builder.test;

public class FullModeBuilder extends DisplayBuilder{
	
	@Override
	public void buildViewMenu() {
		dis.setViewMenu("完整模式--界面菜单");
	}

	@Override
	public void buildPlaylist() {
		dis.setPlaylist("完整模式--播放列表");
	}

	@Override
	public void buildMainDialog() {
		dis.setMainDialog("完整模式--主窗口");
	}

	@Override
	public void buildControlStrip() {
		dis.setControlStrip("完整模式--控制条");
	}

}
