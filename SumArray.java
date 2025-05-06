class SumArray
{
    public static void main(String args[])
    {
        int a[] = new int[5];
        a[0]=5;
        a[1]=3;
        a[2]=7;
        a[3]=11;
        a[4]=15;
        int sum=0;
        for(int i=0;i<5;i++)
        {
            sum= sum + a[i];

        }
        System.out.println("sum=" +sum);
    }
}