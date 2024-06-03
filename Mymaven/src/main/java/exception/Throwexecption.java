package exception;

public class Throwexecption {
	public void voteEligible(int age) {
		if (age<18) {
			throw new ArithmeticException("COndition wrong");
	}
	else
	{
		System.out.println("ELigible for voting");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
