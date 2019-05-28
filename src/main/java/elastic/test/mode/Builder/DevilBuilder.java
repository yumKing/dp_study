package elastic.test.mode.Builder;

public class DevilBuilder extends ActorBuilder{

	@Override
	public void buildType() {
		actor.setType("恶魔");
	}

	@Override
	public void buildSex() {
		actor.setSex("男");
	}

	@Override
	public void buildFace() {
		actor.setFace("丑陋");
	}

	@Override
	public void buildConsume() {
		actor.setConsume("盔甲");
	}

	@Override
	public void buildHairstyle() {
		actor.setHairstyle("简短");
	}

}
