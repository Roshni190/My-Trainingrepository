package collection;
import java.util.HashSet;
import java.util.Set;
public class HahsetCLass {
	public void setdisplay() {
		Set<Integer>col=new HashSet<Integer>(); // non generic array list
		col.add(10);
		col.add(20);
		col.add(30);
		col.add(30);
		col.add(40);
		System.out.println(col);
		System.out.println(col);
		col.remove(0);
		System.out.println(col);
		System.out.println(col.size());
	}
		
	public static void main(String[] args) {
		HahsetCLass obj=new HahsetCLass();
		//obj.print();
		//obj.generic();
		obj.setdisplay();

	}

}
