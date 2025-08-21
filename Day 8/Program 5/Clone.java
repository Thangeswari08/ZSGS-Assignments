class Sample implements Cloneable {
    int x = 10;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sample s1 = new Sample();
        Sample s2 = (Sample) s1.clone();

        System.out.println("Original: " + s1.x);
        System.out.println("Cloned: " + s2.x);

        s2.x = 20;
        System.out.println("Original: " + s1.x);
        System.out.println("Cloned: " + s2.x);   
    }
}
