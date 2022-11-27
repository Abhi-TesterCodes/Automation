package PageObjectModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Vector;

public class CollectionFramework 
{
	
	public static void main(String[] args) 
	{
		ArrayList li = new ArrayList();
		
		/*li.add("Abhishek"); //ArrayList can add hetrogenous data and it is called by Index
		li.add(80000);
		li.add('M');
		li.add(11.5);
		li.add(true);
		
		System.out.println(li.get(0));
		System.out.println(li.get(1));
		System.out.println(li.get(2));
		System.out.println(li.get(3));
		System.out.println(li.get(4));*/
		
		/* LinkedList<Integer> List = new LinkedList<Integer>();
		List.add(67);
		List.add(null); //Accept null values Multiple times
		List.add(null);
		List.add(10);
		List.add(10); //Accept Duplicate values Multiple times
		
		System.out.println(List.get(0));
		System.out.println(List.get(1));
		System.out.println(List.get(2));
		System.out.println(List.get(3));
		System.out.println(List.get(4)); */
		
		/*Vector<String> v = new Vector<>();
		v.add(null);
		v.add("Abhi");
		v.add(null); //Accept null only once
		v.add("Abhi"); //Accept duplicate once only
		v.add("Nashik");
		
		Iterator i = v.iterator();
		
		while (i.hasNext())
		{
			System.out.println(i.next());
		}*/
				
	
		/*PriorityQueue<String> p = new PriorityQueue<String>();
		p.add("Abhishek");
		//p.add(null); //Doesn't accept null value shows null pointer exception
		p.add("Nashik");
		p.add("Maharashtra");
		
		Iterator i = p.iterator();
		
		while (i.hasNext())
		{
			System.out.println(i.next());
		}*/
		
		/*HashSet hs = new HashSet();
		hs.add(34);
		hs.add("Hello"); 
		hs.add(null); //Insertion order also not followed in it
		hs.add("Hello");//If we add duplicate but it is called once only
		
		Iterator is = hs.iterator();
		
		while (is.hasNext())
		{
			System.out.println(is.next());
		}*/
		
				
		/*HashMap hm = new HashMap();
		hm.put(1, null);
		hm.put("two", null);
		hm.put('c',"Nashik");
		hm.put(null, "Maharashtra");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(null)); //Accept null and duplicate values but not as per insertion
		System.out.println(hm.get("two"));
		System.out.println(hm.get('c'));
		System.out.println(hm.get(null));*/
		
		/*Hashtable<Integer, String> htb = new Hashtable<>();
		htb.put(1,"Hello");
		htb.put(2,"Nashik");
		htb.put(3,"Nashik");
		
		System.out.println(htb.get(1));
		System.out.println(htb.get(2));
		System.out.println(htb.get(3)); */
					
	}
}
