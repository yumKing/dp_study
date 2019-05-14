package elastic.test.elasticsearch.mode.Builder;
/**
 * 	建筑者模式
 *	 开发一个小工具来创建游戏角色，可以创建不同类型的角色并可以灵活增加新的角色
 *	无论是何种造型的游戏角色，它的创建步骤都大同小异，都需要逐步创建其组成部分，
 *	再将各组成部分装配成一个完整的游戏角色。如何一步步创建一个包含多个组成部分的复杂对象，建造者模式为解决此类问题而诞生
 * @author jinyang
 *
 */
public class Client {

	public static void main(String[] args) {
		
		ActorDirector ad = new ActorDirector();
		//我要创建一个天使角色
		AngelBuilder angel = new AngelBuilder();
		Actor actor = ad.construct(angel);
		System.out.println(actor.getType());
		System.out.println(actor.getFace());
		System.out.println(actor.getConsume());
		System.out.println(actor.getSex());
		System.out.println(actor.getHairstyle());
	}
}
