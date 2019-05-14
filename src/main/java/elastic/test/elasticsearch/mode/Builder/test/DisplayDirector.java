package elastic.test.elasticsearch.mode.Builder.test;

public class DisplayDirector {

	public Display construct(DisplayBuilder builder) {
		if(builder.isMainDialog()) {
			builder.buildMainDialog();
		}
		if(builder.isPlaylist()) {
			builder.buildPlaylist();
		}
		if(builder.isViewMenu()) {
			builder.buildViewMenu();
		}
		if(builder.isControlStrip()) {
			builder.buildControlStrip();
		}
		
		return builder.createDisplay();
	}
}
