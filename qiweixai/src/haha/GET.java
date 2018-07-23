package haha;

public class GET {

	public static void main(String[] args) {
		ProgrammaticallyConfigYard yard = new ProgrammaticallyConfigYard("192.168.200.128:2184");
		//yard.update("testKey6", "17");
		//yard.add("test", "300");
		//yard.add("04gui", "56");
		//yard.add("nihao", "你好啊");
		System.out.println(yard.get("nihao"));
		System.out.println(yard.get("04gui"));
		System.out.println(yard.get("test"));
		System.out.println(yard.get("testKey6"));
			
	}
}
