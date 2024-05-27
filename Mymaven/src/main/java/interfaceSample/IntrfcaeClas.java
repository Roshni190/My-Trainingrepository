package interfaceSample;

public class IntrfcaeClas implements InterfaceName{
	
	public static void printone() {
		System.out.println("hello from emthod");
	}

	public static void main(String[] args) {
		IntrfcaeClas obj1= new IntrfcaeClas();
		obj1.display();
		obj1.print();
		printone();

	}

	@Override
	public void print() {
		System.out.println("hello interface");
		
	}

	@Override
	public void display() {
		System.out.println("heloo interface 2");
		System.out.println(a);
		
	}

}
