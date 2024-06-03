package customexception;

public class TestClass {

	public void eligible(int age) throws LicenceException{
		if(age>=18) {
			System.out.println("Eligible for licence");
		}
		else {
			throw new LicenceException("Not eligible");
		}
	}
	public static void main(String[] args) throws LicenceException {
		
		TestClass onj1=new TestClass();
		onj1.eligible(11);
		
	}

}
