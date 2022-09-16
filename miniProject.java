import java.util.Scanner;
public class miniProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mynum = (int)(Math.random()*100);
		Scanner sc = new Scanner(System.in);
		int usernum = 0;
		
		do {
			System.out.println("Enter Random number 1 to 100 : ");
			usernum = sc.nextInt();
			
			if(mynum == usernum)
			{
				System.out.println("WOOHOO...YOU GUESSED RIGHT NUMBER...");
				break;
			}
			
			else if(mynum > usernum)
			{
				System.out.println("YOUR NUMBER IS SMALL...");
			}
			else
			{
				System.out.println("YOUR NUMBER IS LARGE...");
			}
		}while(usernum >= 0);
			
		System.out.println("COMPUTER GUESSED NUMBER IS : " + mynum);
	}

}
