package synchronizedexample;


class Account 
{

	//private static final Object lock = new Object();
	
	int balance = 5000;

	public  void withdraw(int amount) throws AccountBalanceNegativeException, InterruptedException
	{
		
         	// Critical Section
			
			int diff = balance - amount;
			if(diff>0)
			{

				
				balance = balance- amount;


				System.out.println("Withdrew amount : "+amount +  " and now balance is : "+  balance + " by "+ Thread.currentThread().getName());
				if(balance<0)
				{
					throw new AccountBalanceNegativeException("Balance can not be negative. Current balance is :"+ balance);
				}
			}
			else
			{
				System.out.println("Insufficient Balance");
			}
				
		
	}

}

class WithDrawer extends Thread
{
	Account account;

	public void run()
	{

		try {
			System.out.println("Going to withdraw money from account  "+ " by "+ Thread.currentThread().getName() + " balance is "+ account.balance);
			account.withdraw(100);
		} catch (Exception e) {

			System.out.println("Exception :"+ e);
		}

	}

}