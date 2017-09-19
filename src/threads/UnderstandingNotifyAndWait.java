package threads;

public class UnderstandingNotifyAndWait 
{
	
	public static void main(String[] args) 
	{
		Bank bk = new Bank();
		Withdraw rb = new Withdraw(bk);
		Deposit d = new Deposit(bk, 25000);
		Thread t = new Thread(rb);
		Thread t2 = new Thread(d);
		t.start();
		t2.start();
	}

}

class Withdraw implements Runnable
{
	Bank bk;
	
	public Withdraw(Bank bk)
	{
		this.bk = bk;
		
	}
	
	public void run()
	{
		bk.withDraw();
	}
}

class Deposit implements Runnable
{
	Bank bk;
	int amount;
	public Deposit(Bank bk, int amount)
	{
		this.bk = bk;
		this.amount = amount;
	}
	
	public void run()
	{
		bk.deposit(amount);
	}
}

class Bank{
	
	
	int balance = 10000; 
	
	
	
	public synchronized void withDraw()
	{
		System.out.println("Witdrawing money");
		if(balance < 15000)
		{
			System.out.println("Balance is low waiting for deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Got balance withdrawing");
		}
	}
	
	public synchronized void deposit(int amount)
	{
		System.out.println("Depositing money");
		balance+=amount;
		notify();
	}
}