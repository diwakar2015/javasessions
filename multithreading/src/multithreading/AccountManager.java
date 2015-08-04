package multithreading;

public class AccountManager {

	public static void main(String[] args) {

		Account account = new Account();

		for(int i=1; i<=50; i++)
		{
			WithDrawer userThread = new WithDrawer();
			userThread.account = account;	
			userThread.start();
			userThread.setName("AccountHolder-"+i);
		}



	}
}


class Account 
{

	//private static final Object lock = new Object();
	
	int balance = 5000;

	public synchronized void withdraw(int amount) throws AccountBalanceNegativeException, InterruptedException
	{
		
         	// Critical Section
			
			int diff = balance - amount;
			if(diff>0)
			{

				Thread.sleep(100);
				balance = balance- amount;


				System.out.println("Withdrew amount : "+amount +  " and now balance is : "+  balance + " by "+ Thread.currentThread().getName());
				if(balance<0)
				{
					throw new AccountBalanceNegativeException("Balance can not be negative.");
				}
			}
			
			
			
			System.out.println("I need not to be blocked...");
		
	}

}

class WithDrawer extends Thread
{
	Account account;

	public void run()
	{

		try {
			System.out.println("Going to withdraw money from account  "+ " by "+ Thread.currentThread().getName() + " balacne is "+ account.balance);
			account.withdraw(100);
		} catch (Exception e) {

			System.out.println("Exception :"+ e);
		}

	}

}