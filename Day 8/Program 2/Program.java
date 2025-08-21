class Student {
	String name;
	int rollNumber;
	Student(String name,int rollNumber){
	this.name=name;
	this.rollNumber=rollNumber;
	}
	public static void main (String args[]){
	Student s1=new Student("Justin",101);
	Student s2=new Student("Kingston",103);
	Student s3=new Student("Livingston",102);
	System.out.println(s1);
	System.out.println(s1.toString());
	System.out.println(s2);
	System.out.println(s3);
	}
}