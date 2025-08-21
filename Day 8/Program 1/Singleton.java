class Singleton{
	private static Singleton sin;

 	private Singleton(){
             System.out.println("Object Created...");
	}
    
        public static Singleton getInstance(){
             if(sin == null)
		{
		  sin = new Singleton();
		}
 
        return sin;
        }
  }

class SingleDemo{
        public static void main(String[] args){

            Singleton s1 = Singleton.getInstance();
	    Singleton s2 = Singleton.getInstance();

            System.out.println(s1==s2);
          }
     }       
    