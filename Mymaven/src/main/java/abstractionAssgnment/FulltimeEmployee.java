package abstractionAssgnment;

public class FulltimeEmployee extends Employee {

	public static void main(String[] args) {
		FulltimeEmployee obj1=new FulltimeEmployee();
		obj1.Calculatesalary();

	}

	@Override
	public void Calculatesalary() {
	int salaryperhour=1200;
	//int totalsalary;
	System.out.println("Total Salary is "+salaryperhour*8);
		
	}

}
