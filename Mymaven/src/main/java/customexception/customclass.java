package customexception;

public class customclass {
public void eligible(int age) throws LicenceException {
	
	if (age<18)
	{
		System.out.println("Eligible for licence");
	}
	else
	{
		throw new LicenceException("Not eligible");
		
	}
}

	public static void main(String[] args) throws LicenceException {
		customclass	obj= new customclass();
		obj.eligible(18);

	}

}
