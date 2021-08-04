package arraylist;

import java.util.ArrayList;

public class ArraylistTraverse {

	public static void main(String[] args) {
	ArrayList<String> list= new ArrayList<String>();
	list.add("Mango");
	list.add("Orange");
	list.add("Apple");
	list.add("Pineapple");
System.out.println("1st element="+list.get(1));
list.set(2, "Date");
for(String s:list) {
	System.out.println(s);
}


	}

}
