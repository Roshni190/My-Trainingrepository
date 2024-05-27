package abstractionAssgnment;

public class Contractor extends Employee{

	public static void main(String[] args) {
		Contractor onj1=new Contractor();
		onj1.Calculatesalary();

	}

	@Override
	public void Calculatesalary() {
		int paymentperhour = 130;
		int nofhour=5;
		int totalsalary=paymentperhour*nofhour;
		System.out.println("Total Salary of Contractor is "+totalsalary);
		
		
	}

}
