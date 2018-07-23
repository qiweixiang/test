package haha;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProgrammaticallyConfigYardTest {
	private final static Logger logger = LoggerFactory
			.getLogger(ProgrammaticallyConfigYard.class);
 
	public static void main(String[] args) {
		ProgrammaticallyConfigYard yard = new ProgrammaticallyConfigYard("192.168.200.128:2181");
		/*yard.add("testKey1", "1");
		yard.add("testKey2", "2");
		yard.add("testKey3", "3");
		yard.add("testKey4", "4");
		yard.add("testKey5", "5");
		yard.add("testKey6", "90");*/
		System.out.println("value is===>"+yard.get("testKey1"));
		//yard.update("testKey6", "testKey6");
		/*yard.delete("testKey1");
		yard.delete("testKey2");
		yard.delete("testKey3");
		yard.delete("testKey4");
		yard.delete("testKey5");
		yard.delete("testKey6");*/

}
}
