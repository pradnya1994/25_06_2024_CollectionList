
/*
 * *Vector is non-synchronized ...So allow  paraller execution. hench It is not thread safe
 */
 package arrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(null);
		list.add(400);  //Duplicates are allowed

		Iterator<Integer> itr = list.iterator();

		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
