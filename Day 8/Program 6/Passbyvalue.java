class PassDemo{
    public static void main(String[] args) {
        int a = 10;
        modify(a);
        System.out.println("After modify method: " + a); 
    }

    static void modify(int x) {
        x = x + 5;
        System.out.println("Inside modify method: " + x); 
    }
}
