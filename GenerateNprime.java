class GenerateNprime 
{
    public static void main(String[] args)
    {
        int count = 0 ;
        int n = 10;
        int start = 2;
        while (count !=n)
        {
            int a =start;
            boolean flg = true;
            for(int i = 2 ; i<a; i++)
            {
                if(a%i==0)
                {
                    flg = false;
                    break;
                }
            }
            if(flg)
            {
                System.out.print(a+ " ");
                count ++;
            }
            start++;
        }
        
    }
}
