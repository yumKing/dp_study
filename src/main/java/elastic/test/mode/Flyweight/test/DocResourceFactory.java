package elastic.test.mode.Flyweight.test;

import java.util.Hashtable;

public class DocResourceFactory {

	private static DocResourceFactory factory = new DocResourceFactory();
	private static Hashtable<String,DocResource> ht;
	
	private DocResourceFactory() {
		DocResource video,picture,animal;
		video = new Video();
		picture = new Picture();
		animal = new Animal();
		ht = new Hashtable<String, DocResource>();
		ht.put("video", video);
		ht.put("picture", picture);
		ht.put("animal", animal);
	}
	
	public static DocResourceFactory getInstance() {
		return factory;
	}
	
	public DocResource getDocResource(String key) {
		return ht.get(key);
	}
}
