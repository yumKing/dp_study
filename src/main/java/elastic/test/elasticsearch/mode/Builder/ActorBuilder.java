package elastic.test.elasticsearch.mode.Builder;

public abstract class ActorBuilder {
	
	protected  Actor actor = new Actor();
	
	public abstract void buildType();
	public abstract void buildSex();
	public abstract void buildFace();
	public abstract void buildConsume();
	public abstract void buildHairstyle();
	
	public Actor createActor() {
		return actor;
	}
}
