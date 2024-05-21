package globalAggregationAssignment;
import globalAggregationAssignmentadddress.AssignmentAddress;
public class GlobalAggregationStudent {
	AssignmentAddress address;
	String name;
	int rollnum;
	
	public GlobalAggregationStudent(String name, int rollnum,AssignmentAddress address ) {
		this.name=name;
		this.rollnum=rollnum;
		this.address=address;
	}
public void display()
{ System.out.println("Student Name is "+name );
 System.out.println("rollnumber is "+rollnum );
 System.out.println("HouseName is "+address.housename );
 System.out.println("Street is "+address.street );
 System.out.println("District is "+address.district );
 System.out.println("Pin is "+address.pin);
}
	public static void main(String[] args) {
		AssignmentAddress ad1=new AssignmentAddress("House1", "Street1","ekm",682320);
		GlobalAggregationStudent stud1= new GlobalAggregationStudent("Roshni",12,ad1);
		stud1.display();
	}
}




		