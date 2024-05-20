package encapsulation2;
import encapsulation1.NameAge;
public class User {

	public static void main(String[] args) {
		
		NameAge obj= new NameAge();
		obj.setter("John", 5);
		obj.getter();
	}

}
