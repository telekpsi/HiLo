import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		//ready player 1
		Scanner sc = new Scanner(System.in);
		
		//random integer creation
		int number = (int)(Math.random()*100+1);
		
		//setup game loop
		int guess=0;
		while(guess!=number){
			System.out.println("Guess a number between 1-100");
			guess=sc.nextInt();
			if (guess<number)
				System.out.println("You guessed too low, try again");
			if (guess>number) 
				System.out.println("You guessed too high, try again");
		}
		System.out.println("You guessed correctly!");
		sc.close();
		return;
	}

}
