package polymorphism;

public class ChildPrint extends ParentPrint{

	public void display() {//arrow represent parent class, so first execut parent and child override parent
		super.display();
		System.out.println("Child class method");

	}
	public static void main(String[] args) {
		ChildPrint obj1= new ChildPrint();
		obj1.display();//execute 5th line
	}

}
