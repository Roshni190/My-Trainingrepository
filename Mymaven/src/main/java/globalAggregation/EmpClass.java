package globalAggregation;

import globalAggregationaddress.AddressClass;

public class EmpClass {
	AddressClass address; //reference to address class in different package
	int empid;
	String name;
	String designation;
	
	public EmpClass(int empid, String name, String designation, AddressClass address)
	{
	this.empid=empid;
	this.name=name;
	this.designation=designation;
	this.address=address;
}
public void display()
{
	System.out.println("Empid: "+ empid);
	System.out.println("Name: "+ name);
	System.out.println("designation: "+ designation);
	System.out.println(address.housename);
	System.out.println(address.street);
	System.out.println(address.district);
	System.out.println(address.pin);
}
	
	public static void main(String[] args) {
		AddressClass ad1= new AddressClass("house1","street1","districtone",682302);
		EmpClass em1= new EmpClass(101,"Rosh","Manager",ad1);
		AddressClass ad12= new AddressClass("house11","street121","district12one",682302);
		EmpClass em2= new EmpClass(103,"Jins","Manager",ad12);
		
		em1.display();
		em2.display();

	}

}
