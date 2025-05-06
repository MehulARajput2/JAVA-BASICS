class DivideByZeroException extends Exception
{
    public String toString()
    {
        return"Divid by zero operation is not possible";
    }
}

class DivideByZeroExceptionDemo
{
    public static void main (String args[])
    {
        try
        {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            if(b==0)
            {
                DivideByZeroException e = new DivideByZeroException();
                throw e;
            }
            System.out.println("Division=" +(a/b));

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}