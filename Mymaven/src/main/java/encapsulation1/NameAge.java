package encapsulation1;

public class NameAge {
private String name; //private -encapsulation
private int age;

public void setter(String name, int age) {
	this.name=name;
	this.age=age;
}
public void getter() {
	age=age*2; // modify in getter method
	System.out.println("Name" +name);
	System.out.println("Age" +age);
}
}
