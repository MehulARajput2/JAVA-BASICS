
class StringMethodDemo {
    public static void main(String[] args) {
        String s = "kdp patan";
        System.out.println("lenght=" + s.length());
        System.out.println("Charat 5th index=" + s.charAt(5));
        System.out.println("String contains kdp =" + s.contains("kdp"));
        System.out.println("String contains kdpp =" + s.contains("kdpp"));
        String test = "AOOP,ISE,IWD,IPDC,CN,MPT";
        String subjects[] = test.split(",");
        for (String sub : subjects) {
            System.out.println(sub);
        }
        String name = "Mehul";
        int age = 17;
        int salary = 50000;
        String formateString = String.format("My Name is %s , My age is %d, My salary is  %d", name, age, salary);
        System.out.println(formateString);
    }
}
