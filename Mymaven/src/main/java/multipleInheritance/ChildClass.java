package multipleInheritance;

public class ChildClass implements Parent1,Parent2{ //public class ChildClass implements  Parent2 if parent2  extends parent1 

	public static void main(String[] args) {
		//ChildClass child1=new ChildClass();
		//child1.print();
		//child1.display();
Parent1 p1=new ChildClass();
p1.print();//while creating interface reference, we need to give classname of childclass, interface dont have constructor, so we give class constructor
//p1.display();// this is because, we created refernce for parent1 , for parent 2, we need to create another reference.
	}
	

	@Override
	public void print() {
		System.out.println("print from childclass");
		
	}

	@Override
	public void display() {
		System.out.println("display from childclass");
		
	}

}
