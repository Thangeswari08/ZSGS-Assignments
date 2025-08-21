class Exception7 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Handled in main: " + e);
        }
    }

    static void method1() {
        method2();
    }

    static void method2() {
        int a = 10 / 0; 
    }
}
