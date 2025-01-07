

public class GarbageCollector {
	public static void main (String args[]){
		Demo d1 = new Demo();
		d1 = null;
		System.gc();
	}
}

class Demo{
	public Demo(){
		System.out.println("The object has Been Created!!");
	}
	@Override
	protected void finalize(){
		System.out.println("The Object is about to be Deleted ....Object Deleted !!");
	}
}