package assignmentPolymorphis;

public class Onseason extends Offseason{
	
public void discount() {
	super.discount();
	
	int discount=(amount*40)/100;
	
	System.out.println("On season amount is "+discount);
}

	public static void main(String[] args) {
		Onseason obj1=new Onseason();
		obj1.discount();
	}

}
