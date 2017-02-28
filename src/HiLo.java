import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		//ready player 1
		Scanner sc = new Scanner(System.in);
		
		String restart = "";
		
		//setup outer game loop (never thought I'd see a use for a do-while...)
		do{
			//random integer creation
			int number = (int)(Math.random()*100+1);
			
			//setup inner game loop
			int guess=0;
			while(guess!=number){
				System.out.println("Guess a number between 1-100");
				guess=sc.nextInt();
				if (guess<number)
					System.out.println("You guessed too low, try again");
				if (guess>number) 
					System.out.println("You guessed too high, try again");
			}
			System.out.println("You guessed correctly!  Play Again? (y/n)");
			restart = sc.next();
		} while (restart.equalsIgnoreCase("y"));
		
		sc.close();
		System.out.println("Alright, that's cool.  Bye.");
		return;
	}

}
