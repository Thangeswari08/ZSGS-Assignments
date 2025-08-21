import java.util.*;
class Student{
         String name;
         int rollno;

     Student(int rollno ,String name){
        this.name=name;
	this.rollno=rollno;
	}
  
     public String toString(){
          return rollno+" "+name;
        }
}
  class RollnoComparator implements Comparator<Student>{
      
      public int compare(Student s1,Student s2){
            return s1.rollno-s2.rollno;
        }
}

  class ComparatorDemo{
       public static void main(String[] args){
             List<Student> list = new ArrayList<>();
             list.add(new Student(2,"Devi"));
	     list.add(new Student(1,"Thango"));
	     list.add(new Student(4,"Muthu"));
	     list.add(new Student(3,"Kalai"));

	  Collections.sort(list,new RollnoComparator());
          for( Student s:list){

	  System.out.println(s);
           }
	
       }
}
              







