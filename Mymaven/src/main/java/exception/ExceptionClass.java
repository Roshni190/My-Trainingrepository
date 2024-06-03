package exception;

public class ExceptionClass {
	public void display() {
		int a=10;
		try {
		int b=a/0;
		System.out.println(b);
		}
		/*catch(Exception e) {
			System.out.println("exception handled");
			
			System.out.println(e);
		}*/
		finally{
			System.out.println("finally block");
		}
	}

	public static void main(String[] args) {
		ExceptionClass obj1=new ExceptionClass();
		
	//System.out.println("before exceptiom");
		obj1.display();
		
	System.out.println("after evebc");
	}
}
