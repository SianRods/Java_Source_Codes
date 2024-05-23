
public class ReviseStrings {
	public static void main(String args[]) {
		String name = new String("Elden ");
		String name2 = "Ring Game  ";
		// String is a Class and Not a Primitive Data Types
		// Using Different Methods of the String Class
		name.isEmpty();
		name.equals("My Name"); // --> Equals is used for object
		name.length();
		name2.compareTo("Hello World");
		System.out.println(name.toLowerCase());
		name2.equalsIgnoreCase(name);
		System.out.println(name.concat(name2));
		System.out.println(name.contains("e"));
		System.out.println(name+name2.substring(0));
	}
}