package elastic.test.elasticsearch.mode.Builder.test;

public class MemoryBuilder extends DisplayBuilder{

	@Override
	public void buildViewMenu() {
		//TODO:因为是记忆模式，不需要建造
	}

	@Override
	public void buildPlaylist() {
		dis.setPlaylist("记忆模式--播放列表");
	}

	@Override
	public void buildMainDialog() {
		dis.setMainDialog("记忆模式--主窗口");
	}

	@Override
	public void buildControlStrip() {
		dis.setControlStrip("记忆模式--控制条");
	}

	@Override
	public boolean isViewMenu() {
		return false;
	}

}
