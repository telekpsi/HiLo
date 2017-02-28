import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HiLo extends JFrame{
	
	private JTextField txtGuess;
	private JLabel lblOutput;
	private int number;
	
	public static void main(String[] args){
		HiLo game = new HiLo();
		game.randomMaker();
		game.setSize(new Dimension(480,320));
		game.setVisible(true);
	}
	
	public HiLo() {
		getContentPane().setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(null);
		
		JLabel lblHigherOrLower = new JLabel("Higher or Lower?");
		lblHigherOrLower.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		lblHigherOrLower.setBounds(6, 27, 434, 14);
		lblHigherOrLower.setForeground(Color.DARK_GRAY);
		lblHigherOrLower.setBackground(Color.CYAN);
		lblHigherOrLower.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblHigherOrLower);
		
		JLabel lblNewLabel = new JLabel("Guess a number between 1 and 100");
		lblNewLabel.setFont(new Font("Sitka Small", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(85, 75, 276, 32);
		getContentPane().add(lblNewLabel);
		
		txtGuess = new JTextField();
		txtGuess.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 14));
		txtGuess.setHorizontalAlignment(SwingConstants.CENTER);
		txtGuess.setBounds(180, 108, 86, 39);
		getContentPane().add(txtGuess);
		txtGuess.setColumns(10);
		
		JButton btnGuess = new JButton("GUESS");
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				checker();
			}
		});
		btnGuess.setFont(new Font("Sitka Banner", Font.BOLD | Font.ITALIC, 14));
		btnGuess.setBounds(180, 158, 86, 23);
		getContentPane().add(btnGuess);
		
		lblOutput = new JLabel("DO IT");
		lblOutput.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setBounds(105, 218, 236, 32);
		getContentPane().add(lblOutput);
	}

	//check guess
	public void checker(){
		String guessText=txtGuess.getText();
			
		//guess and check
		int guess=0;
		try {
			guess=Integer.parseInt(guessText);
		} catch (NumberFormatException e) {
			lblOutput.setText("I need a number here, buddy");
			//do something here?
		}
		if (guess<1 ||guess>100)
			lblOutput.setText("STAY INSIDE THE ARBITRARY LINES!");
		else if (guess<number) //too low
			lblOutput.setText("You guessed too low, try again");
		else if (guess>number) //
			lblOutput.setText("You guessed too high, try again");
		else if (guess==number){
			lblOutput.setText("That's the one! Now do it again!");
			randomMaker();
		}
	}
	
	//random integer creation
	public void randomMaker(){
		number = (int)(Math.random()*100+1);
	}
}
