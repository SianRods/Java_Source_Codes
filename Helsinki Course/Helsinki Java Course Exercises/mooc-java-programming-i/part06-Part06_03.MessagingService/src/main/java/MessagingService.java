import java.util.*;
public class MessagingService{
	// Stores ojects of the type Messages 
	private ArrayList<Message> list ;


	public MessagingService(){
		// Forming the list 
		list = new ArrayList<>();

	}


	public void add(Message message){
		if(message.getContent().length()<=280){
			list.add(message);
		}
	}

	public ArrayList<Message> getMessages(){
		return list;
	}
}