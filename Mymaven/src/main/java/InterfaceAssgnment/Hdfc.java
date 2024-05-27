package InterfaceAssgnment;

public class Hdfc implements rbi {

	public static void main(String[] args) {
		Hdfc onh1= new Hdfc();
		onh1.recurretdeposit();

	}

	@Override
	public void recurretdeposit() {
		double finalamount=(amount*interestrate*durationyears);
	System.out.println("Final amount is "+finalamount);	
	}

}
