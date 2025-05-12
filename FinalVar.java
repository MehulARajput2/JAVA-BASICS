class FinalVar {
    final int a = 5;

    public static void main(String[] args) {
        FinalVar fvd = new FinalVar();
        System.out.println("a=" + fvd.a);
    }
}

class FinalVarDemo {
    final int a = 5;

    public static void main(String[] args) {
        FinalVarDemo fvd = new FinalVarDemo();
        fvd.a = 10;
        System.out.println("a=" + fvd.a);
    }
}