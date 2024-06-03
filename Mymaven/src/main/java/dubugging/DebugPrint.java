package dubugging;

public class DebugPrint {

	public void loophere()
	{
		for (int i=0;i<=5;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		DebugPrint obj1=new DebugPrint();
		obj1.loophere();

	}

}
