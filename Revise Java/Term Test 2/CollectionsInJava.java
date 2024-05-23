import java.util.ArrayList;
public class CollectionsInJava {
	public static void main(String args[]){
		ArrayList<Integer> list =  new ArrayList<>();
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		int sum =0 ;

		for(int i =0;i<list.size();i++){
			sum += list.get(i);
		}
		System.out.println(sum);
		System.out.println(list.size());

		list.remove(2);
		System.out.println(list.size());

		System.out.println(list.isEmpty());

	}
}
