package abstraction;

public class Sample2normal extends Sample1Abstrct {

	public static void main(String[] args) {
		Sample2normal obj= new Sample2normal();
		obj.display();
		obj.print();
	}

	@Override  //implemented from abstract class
	public void print() {
		System.out.println("heloo from abstract");
		
	}

}
