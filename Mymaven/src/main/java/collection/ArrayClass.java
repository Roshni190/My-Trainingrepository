package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayClass {

/*public void print () {
		ArrayList col=new ArrayList(); // non generic array list
		col.add(10);
		col.add("arraylsut");
		col.add(7.2f);
		System.out.println(col);
	}
	
	//public void generic() {
		ArrayList<Integer>col=new ArrayList<Integer>();
		col.add(20);
		col.add(40);
		col.add(80);
	// add("null")	// string cannot be added.col.
	System.out.println(col);
	col.remove(1);
	System.out.println(col);
	System.out.println(col.size());
	ArrayList<Integer>coltwo=new ArrayList<Integer>();
	System.out.println(coltwo);
	coltwo.addAll(col); // to add all from col to col2
	System.out.println(coltwo);
	//col.removeAll(col);// to remove all from col
	System.out.println(col);
	//boolean b= col.contains(10);
	//System.out.println(b);
	boolean b= col.contains(80);// to check whether this is there in array
	System.out.println(b);
	System.out.println(col.get(1));// to print the specific index position
	
	//size, contains, get are important
	} */
	
	public void listDisplay() {
		List<Integer>col=new ArrayList<Integer>();
		col.add(23);
		col.add(40);
		col.add(10);
		col.add(70);
		System.out.println(col);
		col.remove(0);
		System.out.println(col);
		System.out.println(col.size());// to get the size
		ArrayList<Integer>col1=new ArrayList<Integer>();
		System.out.println(col1);
		col1.addAll(col);
		System.out.println(col1);
		col1.removeAll(col1);
		System.out.println(col1);
		col1.addAll(col);
		System.out.println(col1);
		boolean b=col1.contains(70);//to check whether 70 is present in array
		System.out.println(b);
		System.out.println(col1.get(2));
	}
	
	
	
	public static void main(String[] args) {
		ArrayClass obj=new ArrayClass();
		//obj.print();
		//obj.generic();
		obj.listDisplay();
	}

}
