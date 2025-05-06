class InsufficientFundException extends Exception
{
    public String toString()
    {
        return "Not Sufficient Balance";
    }
}
class Amount
{
    double bal;
    Amount()
    {
        bal=0;
    }
    void deposite(double amt)
    {
        bal = bal+amt;
        System.out.println("Current Balance=" +bal);
    }
    void withdrawl(double amt)
    {
        try 
        {
            if(bal < amt)
            {
                InsufficientFundException e = new InsufficientFundException();
                throw e;
            }
            bal=bal-amt;
            System.out.println("Current bal=" +bal);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class AccountDemo
{
    public static void main(String args[])
    {
        Amount a = new Amount();
        a.deposite(25000);
        a.withdrawl(20000);
        a.withdrawl(2000);
        a.withdrawl(4000);
    }
}