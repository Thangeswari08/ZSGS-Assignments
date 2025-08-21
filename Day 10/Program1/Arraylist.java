import java.util.ArrayList;
import java.util.Collections;
public class Arraylist{
  	public static void main(String[] args){
    //a) to create a new array list, add some colours (string) and print out the collection.
	ArrayList<String> list=new ArrayList<>();
         list.add("Blue");
	 list.add("Yellow");
	 list.add("Red");
     System.out.println("a) New ArrayList :" + list);


    //b)to iterate through all elements in an array list.
       System.out.println("b) Iterating all elements:");
        for(String s : list ){
            System.out.println(s);
           }
   //c)to insert an element into the array list at the first position.
       System.out.println("c) After adding element at first position:");
          list.add(0,"White");
          System.out.println(list);
   //d. to retrieve an element (at a specified index) from a given array list.
	System.out.println("Retrieving element:");
 
        System.out.println(list.get(1));
   
   //e. to update specific array element by given element.
      System.out.println("e) Update element:");
          list.set(3,"Black");
      System.out.println(list);
 
   //f. to remove the third element from an array list.
      System.out.println("f)Remove element:");
          list.remove(3);
       System.out.println(list);
  //g.to search an element in an array list.
      System.out.println("g)Is this arraylist contains white colour:");
         System.out.println( list.contains("White"));

  //h. to sort a given array list.
       System.out.println("h)Sorted Array:");
         Collections.sort(list);
       System.out.println(list);
        list.add("Lavender");
  //i. to copy one array list into another.
      System.out.println("i) Copy Array:");
         ArrayList<String> str=new ArrayList<>(list);
         //str.addAll(list);
       System.out.println(str);
         
   //j. to shuffle elements in an array list.
    System.out.println("j) Shuffled Array:" );
        Collections.shuffle(list);
        System.out.println(list);
      }
}