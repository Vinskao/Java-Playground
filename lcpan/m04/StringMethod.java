package lcpan.m04;

public class StringMethod {
	public static void main(String[] args) {
		String str = "Hello world, welcome to Java world."; 
		System.out.println(str.charAt(6));
		System.out.println(str.length());
		System.out.println(str.substring(13));
		System.out.println(str.substring(0,11));
		System.out.println(str.indexOf("world"));
		System.out.println(str.indexOf("World"));
		int idx = str.indexOf("world");
		System.out.println(str.indexOf("world", idx+1));
		System.out.println(str.lastIndexOf("world"));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		String[] tokens = str.split(" ");
		for (int i = 0; i < tokens.length; i++)
			System.out.println(tokens[i]);

		tokens = str.split(",");
		for (int i = 0; i < tokens.length; i++)
			System.out.println(tokens[i]);
	}
}
