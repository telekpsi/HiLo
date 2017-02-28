import java.util.InputMismatchException;
import java.util.Scanner;

public class HiLo {

	public static void main(String[] args)throws InputMismatchException{
		//ready player 1
		Scanner sc = new Scanner(System.in);
		String sinEater = "I EAT YOUR ERRORS";
		String restart = "";
		
		//setup outer game loop (never thought I'd see a use for a do-while...)
		do{
			//random integer creation
			int number = (int)(Math.random()*100+1);
			
			//setup inner game loop
			int guess=0;
			while(guess!=number){
				System.out.println("Guess a number between 1-100");
					try {
						guess=sc.nextInt();
						if (guess<1 ||guess>100)
							System.out.println("STAY INSIDE THE ARBITRARY LINES!");
						else if (guess<number)
							System.out.println("You guessed too low, try again");
						else if (guess>number) 
							System.out.println("You guessed too high, try again");
					} catch (InputMismatchException e) {
						System.out.println("I need a number here, buddy");
						sinEater=sc.next();
						continue;
					}
				
			}
			System.out.println("You guessed correctly!  Play Again? (y/n)");
			restart = sc.next();
		} while (restart.equalsIgnoreCase("y"));
		
		restart=sinEater;
		sc.close();
		System.out.println("Whatever.  Bye.");
		return;
	}

}
