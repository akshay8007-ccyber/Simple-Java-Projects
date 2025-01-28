import java.util.Scanner;
class Password
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in)	;
		String storedPassword = "akshay";
		int duration = 5000;

		//label for outer loop
		outerLoop:
		for (; ; ) //infinite loop it will break only 
					//when user is entering correct pin
		{			
			int attempt = 3; // initially user has 2 attempts in every cycle
			do
			{
				System.out.println();
				System.out.println("Enter your password : ");
				String userPassword = sc.next();
				//validate if store and user ented pass is correct
				if(storedPassword.equals(userPassword))
				{
					System.out.println("Phone has been unlocked. ");
					break outerLoop;
					//breaking the outer loop if password is correct
				}
				else 
				{
					System.out.println("Wrong password entered "+(attempt-1)+" attempts left.");
				}
				attempt--;	//updating the attempts 
			}while(attempt!=0);	//check the condition
			System.out.println();
			System.out.println("Phone is locked for "+(duration/1000)+" seconds.");
			//pause the execution for duration ms
			Thread.sleep(duration);
			duration*=2;	//updating the duration for next iteration
		}
	}
}