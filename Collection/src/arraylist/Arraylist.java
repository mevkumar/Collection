package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> list=new ArrayList<String>();
		 list.add("vikash");
		 list.add("pravesh");
		 list.add("ravi");
		 list.add("vikash");
		 System.out.println(list);
		 //Traverse arraylist using itretor
		 Iterator i=list .iterator();//getting element in araylist
		 while(i.hasNext()) {
			 System.out.println(i.next());
		 }
		for(String s:list) {//traversing arraylist using for loop
			System.out.println(s);
		}
		

	}

}
