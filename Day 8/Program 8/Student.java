class Student implements Cloneable {
    String name;
    int rollNo;
    String department;

    Student(String name, int rollNo, String department) {
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }

    public String toString() {
        return "Student[Name=" + name + ", RollNo=" + rollNo + ", Dept=" + department + "]";
    }
}

public class CloneStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Arun", 101, "CSE");

        try {
            Student s2 = (Student) s1.clone();
            System.out.println("Original: " + s1);
            System.out.println("Cloned: " + s2);

            s2.name = "Bala";
            System.out.println("After modification:");
            System.out.println("Original: " + s1);
            System.out.println("Cloned: " + s2);
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning failed: " + e.getMessage());
        }
    }
}
