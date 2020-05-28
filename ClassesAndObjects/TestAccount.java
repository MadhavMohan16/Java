class Account
{
    int acc_no;
    String name;
    float amount;
    void insert(int a,String n,float amt)
    {
        acc_no=a;
        name=n;
        amount=amt;
    }
    void deposit(float amt)
    {
        amount=amount+amt;
        System.out.println("Amount deposited="+amt);
    }
    void withdraw(float amt)
    {
        if(amount>amt)
        {
            amount=amount-amt;
            System.out.println("Amount withdraw="+amt);
        }
        else
            System.out.println("Insufficient Balance");
    }
    void checkBalance()
    {
        System.out.println("Balance="+amount);
    }
    void display()
    {
        System.out.println(acc_no+" "+name+" "+amount);
    }
}
class TestAccount
{
    public static void main(String[]args)
    {
        Account a1=new Account();
        a1.insert(2000343,"karan",1000);
        a1.display();
        a1.checkBalance();
        a1.deposit(4000);
        a1.checkBalance();
        a1.withdraw(1500);
        a1.checkBalance();
    }
}
    
