package elastic.test.elasticsearch.mode.Flyweight.test;

public class Client {

	public static void main(String[] args) {
		
		DocResource video1,picture1,picture2,picture3,animal1,animal2;
		
		DocResourceFactory factory = DocResourceFactory.getInstance();
		video1 = factory.getDocResource("video");
		picture1 = factory.getDocResource("picture");
		picture2 = factory.getDocResource("picture");
		picture3 = factory.getDocResource("picture");
		animal1 = factory.getDocResource("animal");
		animal2 = factory.getDocResource("animal");
		
		video1.show(new Point(1,2), new Act(100,50));
		picture1.show(new Point(4,8), new Act(10,20));
		picture2.show(new Point(10,2), new Act(100,50));
		picture3.show(new Point(53,20), new Act(34,21));
		animal1.show(new Point(12,42), new Act(27,50));
		animal2.show(new Point(93,21), new Act(200,100));
	}
}
