public class AccountTest
{
    public static void main(String[] args)
    {
        Account acc = new Account();
        acc.setRegNumber(1234);
        System.out.println("RegNumber = "+acc.getRegNumber());

        acc.setName("qweqwe");
        System.out.println("Name = "+acc.getName());


        acc.setBalance(100000000);
        System.out.println("Balance = "+acc.getBalance());
    }
}