package elastic.test.mode.Builder;

public class ActorDirector {

	public Actor construct(ActorBuilder builder) {
		builder.buildType();
		builder.buildFace();
		builder.buildConsume();
		builder.buildHairstyle();
		builder.buildSex();
		Actor actor = builder.createActor();
		return actor;
	}
}
