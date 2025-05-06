class MaxThree
{
    public static void main(String args[])
    {
        int a =5 , b = 6 , c = 8;
        int max;
        max = a>b? a:b;
        max = max>c? max:c;
        System.out.println("Maximum Num = " + max);
    }  
}