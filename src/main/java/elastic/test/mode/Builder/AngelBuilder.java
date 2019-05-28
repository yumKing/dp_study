package elastic.test.mode.Builder;

public class AngelBuilder extends ActorBuilder{

	@Override
	public void buildType() {
		actor.setType("天使");
	}

	@Override
	public void buildSex() {
		actor.setSex("女");
	}

	@Override
	public void buildFace() {
		actor.setFace("美丽");
	}

	@Override
	public void buildConsume() {
		actor.setConsume("软甲");
	}

	@Override
	public void buildHairstyle() {
		actor.setHairstyle("飘逸");
	}

}
