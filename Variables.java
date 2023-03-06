class Variables {
    int a = 300;
    static int b = 420;

    void disp() {
        int a = 200;
        System.out.println("The local variable is " + a);
    }

    void disp1() {
        b = b + 100;
        System.out.println(b);
    }

    void disp2() {
        b = b + 100;
        System.out.println(b);
    }

    public static void main(String args[]) {
        Variables obj = new Variables();
        obj.disp();
        obj.disp1();
        obj.disp2();
        System.out.println("The instance variable is " + obj.a);
        System.out.println("The instance variable is " + obj.b);
    }
}
