package collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		/*Operations on ArrayList
		--------------------
		How to declare array list
		how to to add elements/values to array list
		Find size of array list
		remove elements/values from array list
		insert a new element in the middle of array list
		read values from arraylist  */

		ArrayList list =  new ArrayList();
		list.add("welcome");
		list.add(10);
		list.add(10.5);
		list.add(true);
		list.add('A');
		
		System.out.println(list.size());
		System.out.println(list); // welcome, 10,  10.5,  true,  A
		System.out.println(list.get(2)); //10.5  //gets specific element
		
		list.add(1, "selenium");//we insert new element as 1st element 
		System.out.println(list);  //welcome, selenium, 10, 10.5, true, A
		
		list.remove(5);
		System.out.println("after remove: "+ list);//welcome, selenium, 10, 10.5, true
		
		list.remove("welcome");
		System.out.println(list); //selenium, 10, 10.5, true
		
        //PRINT ALL ELEMENTS METHOD 1:  
//		for (Object i : list) {  //prints above elements
//			System.out.println(i);
//		}
		
		//PRINT ALL ELEMENTS. METHOD 2:
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); //prints above elements
		}
		
		

	}

}
