import java.util.*;
class Marks implements Comparable<Marks>{
        String name;
	int Marks;
    Marks(String name,int Marks){
         this.name=name;
	 this.Marks=Marks;
    }



    public int compareTo(Marks m){
         return this.Marks - m.Marks;
     }
      
     
     public String toString(){
        return Marks+" \t"+name;
     }
}

class ComparableDemo{
	public static void main(String[] args){
		List<Marks> list=new ArrayList<>();
        	list.add( new Marks("Devi",99));
		list.add( new Marks("Ramya",90));
		list.add( new Marks("Sidhu",80));
		list.add( new Marks("Shree",80));
		list.add( new Marks("Natchiyar",75));
 		
	     Collections.sort(list);

	     System.out.println("Marks   Name");
             for(Marks m:list){
	    
             System.out.println(m);
            }
       }
 }
	 
         