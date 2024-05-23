
public class Buffer {
	public static void main (String args[]){
		StringBuffer str = new StringBuffer("Star Wars : Fallen Kingdom");
		str.append(" 2024 IS at Sale");
		System.out.println(str);
		str.insert(40, 324.434);
		System.out.println(str);
	}
}
