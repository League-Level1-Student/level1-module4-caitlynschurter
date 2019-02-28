import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DaTypingTutor implements KeyListener {
	JFrame frame;
	JPanel panel;
	JLabel label;
	char currentLetter = generateRandomLetter();
	int lettersTyped;
	float lettersCorrect;

	public static void main(String[] args) {
		new DaTypingTutor().makeFrame();
		
	}

	void makeFrame() {
		lettersCorrect = 0;
		lettersTyped = 0;
		
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500, 500);

		panel = new JPanel();
		panel.setVisible(true);
		frame.add(panel);

		label = new JLabel();
		label.setVisible(true);
		label.setText("W"); // Make the frame big enough
		label.setFont(label.getFont().deriveFont(301.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		panel.add(label);

		frame.addKeyListener(this);
		frame.pack();
		label.setText(Character.toString(currentLetter));
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	Date timeAtStart = new Date();

	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
		Date timeAtEnd = new Date();
		long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
		long gameInSeconds = (gameDuration / 1000) % 60;
		double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
		int charactersPerMinute = (int) (charactersPerSecond * 60);
		JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
		JOptionPane.showMessageDialog(null, "Your accuracy is " + lettersCorrect + "%");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char typedChar = e.getKeyChar();
		System.out.println("Letter Typed: " + typedChar);

		if (lettersTyped == 100) {
			showTypingSpeed(lettersTyped);
			frame.dispose();
		}
		
		if (currentLetter == typedChar) {
			System.out.println("Correct!");
			panel.setBackground(Color.GREEN);
			lettersTyped++;
			lettersCorrect++;
		}

		else {
			System.out.println("Incorrect!");
			panel.setBackground(Color.RED);
			lettersTyped++;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText(Character.toString(currentLetter));
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
