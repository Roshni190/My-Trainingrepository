package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public void display() {
		List<String>col1=new ArrayList<String>();
		col1.add("Apple");
		col1.add("Mango");
		col1.add("Orange");
		col1.add("Grapes");
		col1.add("Guava");
		
		System.out.println(col1);
		Iterator itr=col1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
		itr.remove();
		
	}
	public static void main(String[] args) {
		IteratorExample obj1= new IteratorExample();
		obj1.display();

	}

}
