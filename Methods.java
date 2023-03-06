class Methods {
    int a = 100;
    int x = 2000;

    public static void main(String args[]) {
        Methods obj = new Methods();
        obj.a = obj.a + 100;
        System.out.println(obj.a);
        obj.abc();
        obj.xyz();
    }

    void abc() {
        System.out.println("abc method");

    }

    void xyz() {
        System.out.println("xyz method");
        System.out.println(x);
    }
}
