
	import java.util.ArrayList;
	
	public class Example{
	public static void main(String [] args){
	
	ArrayList<String> fruits = new ArrayList<>();
	
	// add elements
	
	fruits.add("Apple");
	fruits.add("banana");
	fruits.add("cherry");
	
	System.out.println(fruits.get(1));  // output banana
	
	//remove element
	fruits.remove("Apple");
	
	
	// iterate
	
	for(String fruit : fruits){
		System.out.println(fruit);
		
	}
	
	
	System.out.println("size:" + fruits.size());
	
	}
	
		}