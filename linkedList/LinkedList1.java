/*It is internally workng on basis of Doubly Linked List. It is not thread safe*/
package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) 
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		
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
