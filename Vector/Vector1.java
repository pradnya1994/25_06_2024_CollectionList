/*
 * //Vector is synchronized ...So allow only single method to run at a  time. 
 * It will not allow paraller execution.hence It is thread safe
 */
package Vector;

import java.util.Iterator;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) 
	{
		Vector<Integer> list = new Vector<Integer>();
		
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
		
		System.out.println("----------------");
		System.out.println(list.get(3));   //to get the particular value from list
		//System.out.println(list.get(30));  //IndexOutOfBound Exception
		System.out.println(list);


	}

}
